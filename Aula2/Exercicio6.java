/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula2;

/**
 *
 * @author kees
 * KESS JAVA - Módulo 1
 */
public class Exercicio6 {
    public static void main(String [] args)
    {
        int num1=9000, num2=155, num3=223, num4=123999, num5=9989, num6=121;
        int x=0, maior=0, menor=0;
        x=(num1>=1000)?maior++:menor++;
        x=(num2>=1000)?maior++:menor++;
        x=(num3>=1000)?maior++:menor++;
        x=(num4>=1000)?maior++:menor++;
        x=(num5>=1000)?maior++:menor++;
        x=(num6>=1000)?maior++:menor++;
        System.out.println("Maior que 1000:" +maior);
        System.out.println("Menor que 1000:" +menor);
    }

}
