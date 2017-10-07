/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.recursivo.que.ordene.de.mayor.a.menor.un.areglo;

/**
 *
 * @author eve_l
 */
public class ProgramaRecursivoQueOrdeneDeMayorAMenorUnAreglo {

   
     
    public static void main(String[] args) {
        // TODO 
        int mayorAmenor,aa;
        int Areglo;



       int arreglo[] = {5,6,7,8,9};

        for (int a = 0; a < arreglo.length ; a++) {
            for (int e = 0; e < arreglo.length; e++) {
                if (arreglo[a] < arreglo[e]) {
                    aa= arreglo[a];
                    arreglo[a] = arreglo[e];
                    arreglo[e] = aa;
             }
            }
        }

      for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
       
      }
    }
}

     
            
        
        
        
        



       
    
    

