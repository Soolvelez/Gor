/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

/**
 *
 * @author Alumno
 */
public class Arre 
{
    public static void main(String[] args)
    {
        
        int[][] arregloEntero = new int [10][10];
        int n = 1;
        
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                arregloEntero[i][j] = n;
                n++;
            }
        }
        
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print("\t"+arregloEntero[i][j]);
            }
            System.out.println("");
        }
        /*int arreglito[] = {10,2,3,4,5,7,1,6,9,0};
        System.out.println(arreglito[0]);
        System.out.println(arreglito[4]); */
        
//        int[] arregloEntero = new int [20];
//        
//        for(int i=0; i<10; i++){
//            for(int j=0; j<10; j++)
//            {
//                
//            }
//            
//        
//            
//        }
//        
//        for(int i=0; i<20; i++)
//        {
//            arregloEntero[i] = i*3;
//        }
//        
//        
//        for(int i=0; i<20;  i++)
//        {
//            
//        /*System.out.println(arregloEntero[i]);*/
//            
//            if(arregloEntero[i]%2 !=0)
//            {
//                System.out.println("Impares: "+arregloEntero[i]);
//            }
//        
//       
//        
//         } 
//        System.out.println("Termino el For");
    }
    
    
}
