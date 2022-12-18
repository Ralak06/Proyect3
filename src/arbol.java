
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
public class arbol {

    Nodo raiz;

    public arbol() {
        raiz = null;

    }

    public void insertar(int i, Object Persona) {
        Nodo persona = new Nodo(i);
        persona.contenido = Persona;

        if (raiz == null) {
            raiz = persona;
        } else {
            Nodo aux = raiz;
            while (aux != null) {
                persona.Raiz = aux;
                if (persona.llave <= aux.llave) {//ORDENA EL ARBOL 
                    aux = aux.Derecho;
                } else {
                    aux = aux.izquierdo;

                }

            }
            if (persona.llave <= persona.llave) {
                persona.Raiz.izquierdo = persona;

            } else {
                persona.Derecho = persona;

            }
 
        }
    }

    public void recorrer(Nodo persona) {
        if (persona != null) {
            recorrer(persona.izquierdo);
            System.out.println("Indice " + persona.llave + persona.contenido);
            recorrer(persona.Derecho);
        }
    }

    public void Imprimir(Nodo persona){
       
    }
            
    public class Nodo {

        public Nodo Raiz;
        public Nodo izquierdo;
        public Nodo Derecho;
        public int llave;
        public Object contenido; //permite almacenar un objeto sea int o string 

        public Nodo(int indice) {
            llave = indice;
            Derecho = null;
            izquierdo = null;
            Raiz = null;
            contenido = null;

        }

    }

}
