package com.matiasCoco.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion(){

        Connection conexion = null;

        var baseDeDatos = "estudiantes_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDeDatos;
        var usuario = "root";
        var password = "indio2018";

        //Cargamos la clase del driver de mysql en memoria

        try{
            //Lo que se encuentra dentro try son las lineas que hacen conexion a la Base de Datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario,password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: " + e.getMessage());
        }

        return conexion;
    }

    public static void main (String[] args){

        var conexion = Conexion.getConexion();

        if(conexion != null){
            System.out.println("Conexion exitosa: " + conexion);
        } else {
            System.out.println("Error al conectarse.");
        }
    }
}
