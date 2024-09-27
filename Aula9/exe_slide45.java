/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9;

/**
 *
 * @author kees
 */
public class exe_slide45 {
    public static void main(String [] args){
        Calculos operacoes = new Calculos();
        operacoes.number1 = 1;
        operacoes.number2 = 4;
        int number3 = 5;
        System.out.println(operacoes.somar(operacoes.number1, operacoes.number2, number3));
        System.out.println(operacoes.subtrair2(operacoes.number1, operacoes.number2, number3));
        System.out.println(operacoes.multiplicar(operacoes.number1, operacoes.number2, number3));
        //Fazer para as outras operacoes....
    }

}
