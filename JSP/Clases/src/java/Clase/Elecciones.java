/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

public class Elecciones {
    private static int ganador;    
        public static int Partidos(int num1, int num2, int num3, int num4){
            if(num1>num2 && (num1>num3)&&(num1>num4)){
                ganador = num1;
            }
            if(num2>num1 && (num2>num3)&&(num2>num4)){
                ganador = num2;
            } 
            if(num3>num2 && (num3>num1)&&(num3>num4)){
                ganador = num3;
            }     
            if(num4>num2 && (num4>num1) &&(num4>num3)){
                ganador = num4;
            }    
            return ganador;
        }
    private static String PartidoS;
     public static String DeterminarPartidos(int PPrieta, int Psolitario, int Ptricolor, int Pbolillo) {
        if(PPrieta>Psolitario && PPrieta>Ptricolor && PPrieta>Pbolillo){
            PartidoS=" partido La Prieta";
        }
        if(Psolitario>PPrieta && Psolitario>Ptricolor && Psolitario>Pbolillo){
            PartidoS=" partido Solitario";
        }
        if(Ptricolor>PPrieta && Ptricolor>Psolitario && Ptricolor>Pbolillo){
           PartidoS=" partido Tricolor";
        }
        if(Pbolillo>PPrieta && Pbolillo>Ptricolor && Pbolillo>Psolitario){
            PartidoS=" partido Bolillo";
        }
        return PartidoS;
    }
}
