/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Vjjimmy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        
        String cadena1="";
        String cadena2="";
      
////         x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
////          System.out.println("ingrese numero");
////        n=entrada.nextInt();
         cadena1=(JOptionPane.showInputDialog("Ingrese Cadena 1"));
        cadena2=(JOptionPane.showInputDialog("Ingrese cadena2"));
        
         int longitud1=cadena1.length();
         int longitud2=cadena2.length();
        // char[]  arreglo1 = new char[longitud1];
        // char[] aCaracteres;
         char[] frase1 = cadena1.toCharArray();
          char[] frase2 = cadena2.toCharArray();
////         char[]  arreglo2 = new char[longitud2];
         
//             for (int i=0;i<frase1.length;i++)
//             System.out.println(" " + frase1[i]);
          
          for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frase1[j]== frase2[i]) 
                  {
                      frase1[j]=' ';
                  }
              }
          }
            
          
          
           for (int i=0;i<frase1.length;i++)
           System.out.println(" " + frase1[i]);
    }
    
}
