/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9;

/**
 *
 * @author kees
 */
public class Calculos {
    public int number1;
    public int number2;
    public int somar(int number1, int number2, int number3){
        int result = 0;
        result = (number1+number2+number3);
        return result;
    }
    public int subtrair1(){
        int result = 0;
        result = (number1 - number2);
        return result;
    }
    public int subtrair2(int number1, int number2, int number3){
        int result = 0;
        result = (number2 - number1 - number3);
        return result;
    }
    public int multiplicar(int number1, int number2, int number3){
        int result = 0;
        result = (number1 * number2 * number3);
        return result;
    }
    public int dividir(){
        int result = 0;
        result = (number1 / number2);
        return result;
    }
    public int dividir2(int number1, int number2, int number3){
        int result = 0;
        result = (number1 / number2);
        return result;
    }
    public int obterResto1(){
        int result = 0;
        result = (number1 % number2);
        return result;
    }   
    public int obterResto2(int number1, int number2, int number3){
        int result = 0;
        result = (number1 % number2);
        return result;
    }
}