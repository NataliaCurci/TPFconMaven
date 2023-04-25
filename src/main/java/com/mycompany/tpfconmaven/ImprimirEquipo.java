package com.mycompany.tpfconmaven;

import java.sql.*;
import java.util.Scanner;

public class ImprimirEquipo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del equipo a imprimir");
        String equipo=sc.nextLine();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FutbolDB","root","");
            Statement stmt=con.createStatement();
            //Relleno la tabla con los datos del equipo
            ResultSet rs=stmt.executeQuery("select Nombre, Titulares, Suplentes, DirectorTecnico, Puntos, PartidosJugados from Equipos where Nombre = "+"\""+equipo+"\"");
            while(rs.next())
            System.out.println(rs.getString(1)+": "+"\n"+"Titulares:"+rs.getInt(2)+"\n"+"Suplentes:"+rs.getInt(3)+"\n"+"Director Tecnico:"+rs.getString(4)+"\n"+"Puntos:"+rs.getInt(5)+"\n"+"Partidos Jugados:"+rs.getInt(6));
            con.close();
        } catch (Exception ex) { 
            System.out.println(ex);
            }
    }
}

