/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo03alu23
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File archivo = new File("archivo.txt");
        
        // Verificar si existe
        System.out.println(archivo.exists());
        
        // Creando el archivo
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        System.out.println("############### FileWriter ###############");
        
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);
            
            // Escribe o sobreescribe sobre el archivo llamado archivo.txt
            FileWriter fw = new FileWriter("archivo.txt");
            
            // El buffer tiene un String
            BufferedWriter bw = new BufferedWriter(fw);
            
            // La impresora tiene un buffer
            PrintWriter salida = new PrintWriter(bw);
            
            // Texto lo llamas a la impresora
            salida.println(texto);
            salida.println("Esta es la segunda Linea");
            
            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
                
            }
            
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
                
            }
            
            // Cierras el archivo
            salida.close();
            
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("############### FileReader ###############");
        
        try {
            
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("###");
            System.out.println("El texto del archivo es: ");
            
            String linea = br.readLine();
            
            // Mientras haya algo en el archivo
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            
            fr.close();
            
            
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("############### StringTokenizer ###############");
        
        String alumnoParseado = "Eric Fernando,Soto,Bolanhos,321302740,18,3"; 
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        System.out.println(alumnoParseado);
        
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
            
        }
        
        System.out.println("############### Clase alumno ###############");
        

        // Creando 5 alumnos
        Alumno alumno1 = new Alumno("Alan", "Hernandez", "Flores", 321302740, 19, 3);
        System.out.println(alumno1);
        
        Alumno alumno2 = new Alumno("Halley", "Mendoza", "Sanchez", 321254601, 19, 3);
        System.out.println(alumno2);
        
        Alumno alumno3 = new Alumno("Juan", "Fernandez", "Marquez", 323568532, 20, 4);
        System.out.println(alumno3);
        
        Alumno alumno4 = new Alumno("Jose", "Gonzales", "Gutierrez", 335779423, 18, 1);
        System.out.println(alumno4);
        
        Alumno alumno5 = new Alumno("Maria", "Escalante", "Flores", 323578953, 20, 2);
        System.out.println(alumno5);

        // Creando un arrayList para los alumnos
        
        ArrayList<Alumno> lista = new ArrayList<>();
        
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);
        
        System.out.println(lista);
        System.out.println("");
        
        
        // Enviarlos a un documento
        
        
        System.out.println("\nEscribiendo en el archivo txt\n");
        
        try {
            FileWriter fw = new FileWriter("alumnos.txt");
            //FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            
            for (Alumno alumno : lista) {
                //System.out.println(alumno);
                salida.println(alumno);
            }
            
            salida.close();
            
            
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        // Leer cada alumno
        
        
        // Enviar cada alumno a una lista del archivo
        
    }
    
}
