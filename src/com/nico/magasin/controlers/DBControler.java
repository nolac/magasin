package com.nico.magasin.controlers;

import java.sql.*;

public class DBControler {
    private String DBPATH;
    DBControler(String DBPATH){
        this.DBPATH=DBPATH;
    }

    private Connection connect(){
        String url = "jdbc:sqlite:"+this.DBPATH;
        Connection con=null;
        try{
            con= DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    private Statement getStatement(){
        Statement st=null;
        try {
            st= this.connect().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return st;
    }

    /*public ResultSet getResultset(String sql){
        ResultSet rs=null;
        try {
            this.getStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }*/

    public void createTable(String name){
        String sql="CREATE TABLE IF NOT EXISTS "+name + " ( ID INTEGER PRIMARY KEY AUTOINCREMENT);";

        try {
            this.getStatement().executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("TABLE "+ name +" CREATED ");
    }

    public void addColumns(String table,String values){
        String sql="ALTER TABLE "+table+" ADD COLUMN "+values + ";";
        try {
            this.getStatement().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDB(String sql){
        try {
            this.getStatement().executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    ///// main pour le test /////
    public static void main(String[] args){
        DBControler myDB=new DBControler("/Users/nico/Desktop/myTestClassDBControler.db");
        myDB.updateDB("CREATE TABLE IF NOT EXISTS test(id INTEGER PRIMARY KEY AUTOINCREMENT,nom TEXT,prenom TEXT);");
        myDB.updateDB("INSERT INTO test (nom,prenom) VALUES ('vidaud','nicolas'); ");
    }
}
