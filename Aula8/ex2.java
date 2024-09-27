/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ex2 {
    public static void main(String [] args){
        String array[] = {"Curso", "Java", "Certificação", "SCJA", "KESS", "Módulo 1", "2008"};
        String aux = new String();
        System.out.println("Imprimindo o array:");
        for (int i=0; i<array.length; i++){
            aux += (array[i] +" "); 
            System.out.println(array[i]);
        }
        System.out.println("Imprimindo o Resultado:\n" +aux);
    }

}
