/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.arreglos;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemplosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de personas:");
        
        int nPersonas=sc.nextInt();
        sc.nextLine();
        Persona [] personas= new Persona[nPersonas];
        int sumatoria = 0;        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("persona :" +(i+1) + "de" + nPersonas);
            System.out.println("Nombre");
            String nombre=sc.nextLine();
            
             sc.nextLine();
             
            System.out.println("Apellido");
            String apellido=sc.nextLine();
             
             sc.nextLine();
            
            System.out.println("Calificacion");
            int calificacion=sc.nextInt();
            
            sc.nextLine();
            
            personas[i]= new Persona(nombre,apellido,calificacion);
            sumatoria+=calificacion;
        }
        
        //imprimir arreglo personas
        System.out.println("Nombre\t\tApellido\t\tCalificacion");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre()+ "\t\t" +personas[i].getApellido()+ "\t\t" +personas[i].getCalificacion());
            
        }
        System.out.println("El promedio es :"+ sumatoria/nPersonas);
// otro metodo
//          String nombres [];  
//          System.out.println("Ingrese el numeros de los nombres del arreglo:");
//          Scanner sc = new Scanner(System.in);
//          
//          int nombresElementos=sc.nextInt();
//          sc.nextLine();
//          nombres=new String[nombresElementos]; 
//          
//          for (int i = 0; i < nombres.length; i++) {
//            System.out.println("Ingrese el elemento"+ i + ":");
//             nombres[i]=sc.nextLine();
//        }
//           System.out.println("los elementos del arreglo son:");
//
//       //Imprime los elementos de arreglo
//        for (int i = 0; i < nombres.length; i++) {
//           System.out.println(nombres[i]);
//        }

//int edades [];
//      System.out.println("ingrese el numero de elementos del arreglo:");
//      //Leer los elementos del arreglo
//      Scanner sc = new Scanner(System.in);
//      
//      int numeroElementos=sc.nextInt();
//      edades=new int[numeroElementos];
//      
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println("Ingrese el elemento"+ i + ":");
//            edades[i]=sc.nextInt();
//        }
//        System.out.println("los elementos del arreglo son:");
//
//        //Imprime los elementos de arreglo
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println(edades[i]);


//  tODO code application logic here
//        int edades[];
//        edades = new int[3];
//        edades[0]=12;
//        edades[1]=10;
//        edades[2]=15;
        
        //Imprimir arreglo
 
      //  System.out.println("Elemento indice 0: "+ edades[0]);
      //  System.out.println("Elemento indice 1: "+ edades[1]);
       // System.out.println("Elemento indice 2: "+ edades[2]);
        
       // Persona persona[];
       // persona = new Persona [3];
        
       // persona[0]=new Persona("Pepe");
       // persona[1]=new Persona("Diana");
       // persona[2]=new Persona("Luis");
        
        //System.out.println("Persona indice 0: "+ persona[0]);
        //System.out.println("Persona indice 1: "+ persona[1]);
       // System.out.println("Persona indice 2: "+ persona[2]);
        // otro metodo
//        String apellidos[] = {"Suarez","Guillen","Perez","Ramon"};
//        for (int i = 0; i < apellidos.length; i++) {
//            System.out.println("Apellidos indices"+ i + ":"+apellidos[i]);
//        }
//        String edade[] = {"12","10","15"};
//        for (int i = 0; i < edade.length; i++) {
//           System.out.println("Elementos indices "+ i + ":"+edade[i]);
//        }
//        
//        Persona persona[] = {new Persona("Pepe"),new Persona("Diana"),new Persona("Luis")};
//        for (int i = 0; i < persona.length; i++) {
//           System.out.println("Personas indices "+ i + ":"+persona[i]);
//        }
//        int edades [] = {12,10,15};
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println("Edades indices "+ i + ":"+edades[i]);
//        }
    }
    }
    

