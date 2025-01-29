/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo001;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        
        String [] nombres = { "Jason", "Jonathan", "Kristen", "Robin", 
            "Michelle", "Emily", "Noah", "Daniel"};
        String [] apellidos = { "Lynch", "George", "Lang", "Cochran", "Young",
            "Fletcher", "Adkins", "Harris"};
        int [][] notas = { {10, 80, 80, 95}, {40, 80, 80, 45}, {80, 10, 20, 55},
            {70, 30, 20, 65}, {60, 50, 70, 75}, {50, 70, 30, 85},
            {40, 80, 40, 45}, {30, 90, 50, 95}};
        
        double promedio_paralelo = obtenerPromedioParalelo(notas);
        String nombre;
        String apellido;
        String tipoNotas;
        double promedioEstudiante;
        int numeroNotasArribaPromedio;
        int [] filaNotas;
        for (int i = 0; i < nombres.length; i++) {
            nombre = nombres[i];
            apellido = apellidos[i];
            filaNotas = notas[i];
            promedioEstudiante = funcion01(filaNotas);
            numeroNotasArribaPromedio = funcion02(filaNotas, 
                    promedio_paralelo);
            tipoNotas = funcion03(filaNotas);
            presentarReporte(nombre, apellido, tipoNotas, 
                    promedioEstudiante, numeroNotasArribaPromedio);
        }
    }
    
    public static void presentarReporte(String nom, String ap, String notas, 
            double prom, int numeroNotas){
        String reporte = String.format("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Con notas: \n"
                + "%s\n"
                + "Promedio - %2f\n"
                + "Número de notas arriba del promedio: %d\n",
                nom, ap, notas, prom, numeroNotas);
        System.out.printf("%s\n\n", reporte);
    }

    
    public static double obtenerPromedioParalelo(int [][] n){
        int suma = 0;
        double promedio;
        int contador = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                suma = suma + n[i][j];
                contador = contador + 1;
            }
        }
        
        promedio = (double)suma/ contador;
        return promedio;
    }
    
    public static double funcion01(int [] notas){
        int suma = 0;
        double promedio;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        promedio = (double) suma / notas.length;
        return promedio;
    }
    
    public static int funcion02(int [] notas, double promedio){
        
        int contador = 0;
        int nota;
        for (int i = 0; i < notas.length; i++) {
            nota = notas[i];
            if (nota > promedio) {
                contador = contador + 1;
            }
            
        }
        
        return contador;
    }
    
    public static String funcion03(int [] notas){
        String cadena = "";
        
        int nota;
        for (int i = 0; i < notas.length; i++) {
            nota = notas[i];
            if (nota >=0 && nota<=20) {
                cadena = String.format("%s%d-%s\n", cadena, nota, "M");
            }else{
                if (nota >20 && nota<=50) {
                    cadena = String.format("%s%d-%s\n", cadena, nota, "MB");
                }else{
                    if (nota > 50) {
                        cadena = String.format("%s%d-%s\n", cadena, nota, "S");
                    }
                }
            }
            
        }
        
        return cadena;
    }
    
    
    
    
}
