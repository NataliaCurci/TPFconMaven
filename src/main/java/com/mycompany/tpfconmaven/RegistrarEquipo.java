/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpfconmaven;

import java.sql.*;

public class RegistrarEquipo {
    public static void main(String equipo, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Relleno la tabla con los datos del equipo
            int result=stmt.executeUpdate(
                "insert into Equipos (Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados) values ( "+"\""+equipo+"\""+", "+titulares+", "+suplentes+", "+"\""+directorTecnico+"\""+", "+puntos+", "+partidosJugados+")");
            System.out.println("Equipo registrado !");
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
            }
    }
}    
