
package com.mycompany.tpfconmaven;

public class Equipo {
    /*instanciar variables*/
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
   
    /* Constructor para objetos de class Equipo, mantengo el constructor vacio y armo el propio*/
    public Equipo(){}
    public Equipo(String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados){
    System.out.println("Equipo creado");
   }
}

