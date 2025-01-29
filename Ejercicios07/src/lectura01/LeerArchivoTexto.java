package lectura01;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeerArchivoTexto {
    
    // lee registro del archivo
    public static void leerRegistros01() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                              // 1;Melissa;Hawkins;650.2
                              // 2;Steven;Harmon;700.2
                System.out.println(linea);
                
            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n
    
    // lee registro del archivo
    public static void leerRegistros02() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                System.out.println(lista);
                
            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n
    
    
    // lee registro del archivo
    public static void leerRegistros03() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                for (int i = 0; i < linea_partes.size(); i++) {
                    System.out.println(linea_partes.get(i));
                }
                System.out.println("-----------------------------------");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n
    
    public static void leerRegistros04() {
        /*
        Nombre de Materia: Computación
        Promedio de notas: 10,00
        Nombre de Docente: Tara Hernandez
        Tipo de Contrato: contratado

        */
        
        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                System.out.printf("Nombre de Materia: %s\n"
                        + "Promedio de notas: %s\n", 
                        linea_partes.get(0),
                        linea_partes.get(1));
                
                System.out.println("-----------------------------------");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public static void leerRegistros05() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datosTres.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                System.out.printf("%s\n", linea_partes.get(2));
                System.out.println("-----------------------------------");

            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1); 
        } // fin de catch
    }
    
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 
 *************************************************************************/
/*
The java.lang.System.exit() method exits current program by terminating 
running Java virtual machine.
https://www.geeksforgeeks.org/system-exit-in-java/
*/