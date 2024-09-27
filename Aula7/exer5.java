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
public class exer5 {
    public static void main (String [] args){
        String str1 = "Humano";
        String str2 = "HuMaNo";
        String str3 = "hUmAnO";
        String str4 = "humano";
        String str5 = "Humano";
        String output = new String();
        boolean teste1 = str1.equals(str2);
        output = " teste1: " +teste1;
        boolean teste2 = str1.equals(str3);
        output = output + "\n teste2: " +teste2;
        boolean teste3 = str1.equals(str4);
        output = output + "\n teste3: " +teste3;
        boolean teste4 = str1.equals(str5);
        output = output + "\n teste4: " +teste4;
        //fazer outras condicoes para as outras strings....
        JOptionPane.showMessageDialog(null, output);
    }

}
