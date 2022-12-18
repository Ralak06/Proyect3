
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla
 */
public class Proyect3 {
 
    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        // TODO code application logic here
  arbol Arbol = new arbol();
       
        Arbol.insertar(10, "carlos");
        Arbol.insertar(0, "Maria");
        Arbol.insertar(90, "Ana");
        Arbol.insertar(100, "Jorge");
        Arbol.insertar(900, "Luis");
        Arbol.insertar(1000, "Alicia");
        Arbol.insertar(2000, "Andres");
      

        System.out.println("Vamos a visualizar el arbol complero ");
        Arbol.recorrer(Arbol.raiz);

        System.out.println("visualizacion del ARBOL inorden los 3 primeros representan el lado DERECHO,"
                + " Y LOS 3 ULTIMOS EL LADO Izquerdo");
        Arbol.recorrer(Arbol.raiz.izquierdo);

        System.out.println("los nombres Femeninos son"+"Maria"+" "+"  "+"Alicia"+"  "+"Ana");
        
       
         
        
        
    }

}
