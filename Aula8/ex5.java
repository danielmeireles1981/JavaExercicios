/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ex5 {
    public static void main(String [] args){
        int array[] = new int[40];
        String pares="", impares="";
        int contPar=0 , contImpar=0;
        int valor=101;
        for (int count=0; count < array.length; count++){
            array[count]=valor++;
            System.out.println("Mostrando o array:" +array[count]);
            if (valor%2 != 0) {
                impares += valor +",";
                contImpar++;
            }
                else{
                    pares += valor +",";
                    contPar++;
                }
             }
        System.out.println("Numeros pares: "+pares);
        System.out.println("Numeros impares: "+impares);
        System.out.println("Qtde de numeros pares: "+contPar);
        System.out.println("Qtde de numeros impares: "+contImpar);
            
        }
        
    }