package com.beans.wellnesswave.databaseControl;

import com.beans.wellnesswave.utilities.FileHandler;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBRead {
    private static Connection con = null;
    private static Statement SQLStatement = null;
    private static ResultSet result=null;

    public static ResultSet getResult() {
        return result;
    }

//    public ResultSet getResult() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    
    // CONNECT
    public static void connect() {
        System.out.println("Trying to connect to database...");
        try {
            String dbURL = "jdbc:derby://localhost:1527/wellnesswave";
            String username = "wellness";
            String password = "wave";

            System.out.println("About to get a connection....");
            con = DriverManager.getConnection(dbURL, username, password);
            System.out.println("\n<Connection Established Successfully>");
            
            SQLStatement = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
//            SQLStatement = con.createStatement();

            System.out.println("<SQL Statement ready>");
        } catch (SQLException sqlErr) {
            System.out.println("*Error*");
            System.out.println(sqlErr.getMessage());
        } catch (Exception e) {
            System.out.println("*Error*");
            System.out.println(e.getMessage());
        }
    }
    // =====================================

    // TERMINATE
    public static void terminate() {
        try {
            SQLStatement.close();
            System.out.println("\n<SQL Statement method terminated>");
            con.close();
            System.out.println("<Connection terminated>");
        } catch (SQLException ex) {
            Logger.getLogger(DBDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // =====================================

    /*
    * SELECT query examples
    * ---------------------
    
    * SELECT * FROM users
    * SELECT user_ID FROM users
    * SELECT * FROM users WHERE email='email@gmail.com'
    
    EXAMPLE
    * String sqlSelect = "SELECT * FROM users WHERE email = ?";
    * String email = "email@gmail.com";
    * PreparedStatement prepStatement = conn.prepareStatement(
        sqlSelect,
        ResultSet.TYPE_SCROLL_INSENSITIVE, 
        ResultSet.CONCUR_READ_ONLY
    );
    * prepStatement.setString(1, email);
    */
   
    // READ and display 
    public static void readAllRecords(String tableName, int numOfCols) {
        System.out.println("\nALL DATA from " + tableName + " <table>");
        String retrieve_Values_qry = "SELECT * FROM " + tableName;
//        String retrieve_Values_qry = "SELECT * FROM " + tableName + " WHERE user_email='" + "'";

        try {
            result = SQLStatement.executeQuery(retrieve_Values_qry);

            int row = 0;
            if (result != null) {
                while (result.next()) {
                    row++;
                    System.out.println("Data from row: " + row);
                        
                    for (int a=1; a < numOfCols+1; a++){
                        System.out.print(result.getString(a) + " | ");
                    }
                    System.out.println("\n");
                }
            }

            // result.close();
            System.out.println("\n<SQL statement executed Successfully>");

        } catch (SQLException ex) {
            Logger.getLogger(DBRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //***OVERLOAD***//

    public static String[] readAllRecords(String tableName, int numOfCols, String attribute) {
//    public static String[] findAndReadRecord(String tableName, int numOfCols, String attribute) {
        System.out.println("\nALL DATA from " + tableName + " <table>");
        String retrieve_Values_qry = "SELECT * FROM " + tableName + " WHERE user_email='" + attribute + "'";
        System.out.println(retrieve_Values_qry);
        
        String[] personalInfo = new String[numOfCols]; 
        try {
            result = SQLStatement.executeQuery(retrieve_Values_qry);

            int row = 0;
            if (result != null) {
                while (result.next()) {
                    row++;
                    System.out.println("Data from row: " + row);
                        
                    for (int a=1; a < numOfCols+1; a++){
                        personalInfo[a-1] = result.getString(a); 
                        System.out.print(result.getString(a) + " | ");
                    }
                    System.out.println("\n");
                }
            }

            // result.close();
            System.out.println("\n<SQL statement executed Successfully>");

        } catch (SQLException ex) {
            Logger.getLogger(DBRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return personalInfo; 
    }
    
    public static void readAllRecords(String tableName, String colName) {
    
    }
    // =====================================
    
    
    // for journal 
//    public static void readAndWrite(String tableName, int numOfCols, String attribute) {

    public static void readAndWrite(String tableName, int numOfCols, String attribute, String userID) {
        System.out.println("\nALL DATA from " + tableName + " <table>");
//        String retrieve_Values_qry = "SELECT * FROM " + tableName;
//        String retrieve_Values_qry = "SELECT * FROM " + tableName + " WHERE user_email='" + "'";
        String retrieve_Values_qry = "SELECT * FROM " + tableName + " WHERE user_ID='" + attribute + "'";
        System.out.println(retrieve_Values_qry);
        
        String fileName = "journal_" + userID + ".txt";
        FileHandler.openFile(fileName, true);
//        FileHandler.openFile("journal_entries.txt", true);

//        FileHandler.openFile("recordx.txt", true);

        try {
            result = SQLStatement.executeQuery(retrieve_Values_qry);

            int row = 0;
            if (result != null) {
                while (result.next()) {
                    row++;
                    System.out.println("Data from row: " + row);
                        
                    for (int a=1; a < numOfCols+1; a++){
                        System.out.print(result.getString(a) + " | ");

                        FileHandler.writeToFile(result.getString(a) + " | ");
                    }
                    System.out.println("\n");
                }
            }

            result.close();
            System.out.println("\n<SQL statement executed Successfully>");

        } 
        catch (SQLException ex) {
            Logger.getLogger(DBRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally{
            FileHandler.closeFile();
        }
    }

    
}



