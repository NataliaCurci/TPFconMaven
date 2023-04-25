package com.mycompany.tpfconmaven;

import java.sql.*;

public class ImprimirEquipos {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Query para que imprima la tabla con los datos de todos los equipos
            ResultSet rs=stmt.executeQuery("select Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados from Equipos");
            while(rs.next())
            System.out.println("Nombre:"+rs.getString(1)+" Titulares:"+rs.getInt(2)+" Suplentes:"+rs.getInt(3)+" Director Tecnico:"+rs.getString(4)+" Puntos:"+rs.getInt(5)+" Partidos Jugados:"+rs.getInt(6));
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
            }
    }
}
h