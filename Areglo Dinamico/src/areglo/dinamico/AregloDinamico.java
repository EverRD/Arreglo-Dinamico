/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areglo.dinamico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eve_l
 */
public class AregloDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
           ArrayList <String> cadenas; //Objeto de tipo arraylist
     cadenas = new ArrayList<String>();
      String frase, respuesta;
      do{
          frase=JOptionPane.showInputDialog(null, "ingrese la frase");
      //agregar la frase ala lista
      cadenas.add(frase);
       respuesta= JOptionPane.showInputDialog(null,"¿Quieres Ingresar otra Frase (SI/NO)?");
       respuesta = respuesta.toUpperCase();
       }while(!respuesta.equals("NO"));
      
          for(int i=0;i<cadenas.size();i++){
           System.out.println(cadenas.get(i));
          }// TODO code application logic here
    }
    
}
