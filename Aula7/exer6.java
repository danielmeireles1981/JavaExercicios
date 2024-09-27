/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
import javax.swing.*;
public class exer6 {
    public static void main (String [] args){
        String output = new String();
        String str1 = "porta";
        String str2 = "Porta";
        String str3 = "porta";
        int teste1 = str1.compareTo(str2);
        output = "teste1: " +teste1;
        int teste2 = str1.compareTo(str3);
        output = output +"\nteste2: " +teste2;
        System.out.println(output);
    }

}
