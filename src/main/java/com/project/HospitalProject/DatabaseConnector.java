package com.project.HospitalProject;


public class DatabaseConnector {

     /*   // JDBC URL, username and password of MySQL server
        private static final String url = "jdbc:mysql://localhost:3306/antiqshop";
        private static final String user = "root";
        private static final String password = "1234";

        // JDBC variables for opening and managing connection
        *//*private static Connection con;
        private static Statement stmt;
        private static ResultSet rs;*//*

        // Singleton instance
        protected static DatabaseConnector _instance;

        protected String _url;
        protected String _username;
        protected String _password;


        protected DatabaseConnector(String url, String username, String password) {
            _url = url;
            _username = username;
            _password = password;

        }
        *//**
         * Returns the singleton instance
         *//*
        public static DatabaseConnector getInstance() {
            if (_instance == null) {
                _instance = new DatabaseConnector(url, user, password);
            }
            return _instance;
        }

        public Connection getConnection(){
            Connection con = null;
            try {
                //Class.forName("scom.mysql.jdbc.Driver");
                con = DriverManager.getConnection("com.mysql.jdbc.Driver");
            }
            catch (SQLException e){
                throw new RuntimeException(e);
            }
            return  con;
        }


        *//*public static void main(String args[]) {
            String query = "select count(*) from users";

            try {
                // opening database connection to MySQL server
                con = DriverManager.getConnection(url, user, password);

                // getting Statement object to execute query
                stmt = con.createStatement();

                // executing SELECT query
                rs = stmt.executeQuery(query);

                while (rs.next()) {
                    int count = rs.getInt(1);
                    System.out.println("Total number of books in the table : " + count);
                }

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            } finally {
                //close connection ,stmt and resultset here
                try {
                    con.close();
                } catch (SQLException se) { *//**//*can't do anything *//**//* }
                try {
                    stmt.close();
                } catch (SQLException se) { *//**//*can't do anything *//**//* }
                try {
                    rs.close();
                } catch (SQLException se) { *//**//*can't do anything *//**//* }
            }
        }*//*

*/

    }

