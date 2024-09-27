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
public class exer7 {
    public static void main( String [] args){
        String word1 = JOptionPane.showInputDialog("Digite a primeira palavra");
        String word2 = JOptionPane.showInputDialog("Digite a segunda palavra");
        String word3 = JOptionPane.showInputDialog("Digite a terceira palavra");
        String word4 = JOptionPane.showInputDialog("Digite a quarta palavra");
        String word5 = JOptionPane.showInputDialog("Digite a quinta palavra");
        String output = "Comparando palavras";
        output=word1 +","+word2 +","+word3 +","+word4 +","+word5;
        if (word1.regionMatches(true, 0, word2, 0, 3)){
            output += "\na palavra1 possui as 3 iniciais iguais a palavra2";
        }
        if (word1.regionMatches(true, 0, word3, 0, 3)){
            output += "\na palavra1 possui as 3 iniciais iguais a palavra3";
        }
        if (word1.regionMatches(true, 0, word4, 0, 3)){
            output += "\na palavra1 possui as 3 iniciais iguais a palavra4";
        }
        if (word1.regionMatches(true, 0, word5, 0, 3)){
            output += "\na palavra1 possui as 3 iniciais iguais a palavra5";
        }
        //fazer para os outros
        JOptionPane.showMessageDialog(null, output);
    }
}
        