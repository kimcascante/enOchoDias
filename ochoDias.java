package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Modifique el anterior para que calcule la fecha de dentro de 8 días.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp5w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int dia;
        int mes;
        int ano;

        escribir.println("Digite el dia:");
        dia = Integer.parseInt(leer.readLine());

        escribir.println("Digite el mes:");
        mes = Integer.parseInt(leer.readLine());

        escribir.println("Digite el año:");
        ano = Integer.parseInt(leer.readLine());

        if(dia < 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
            dia = dia +8;            
        } else if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)){
            dia = 8;
            mes = mes+1;
        } else if (dia == 31 && mes == 12) {
            dia = 8;
            mes = 8;
            ano = ano+1;
        } else if (dia < 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            dia = dia+8;
        } else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            dia = 8;
            mes = mes+1;
        } else if (dia < 28 && mes == 2){
            dia = dia+8;
        } else if (dia == 28 && mes == 2){
            dia = 8;
            mes = mes+1;
        }

        escribir.println("En 8 dias sera " +dia+ "-" +mes+ "-" +ano);
    }
}