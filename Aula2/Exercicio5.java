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
public class Exercicio5 {
    public static void main (String [] args)
    {
        boolean resp1, resp2, resp3, resp4, resp5;
        resp1=false;
        resp2=true;
        resp3=false;
        resp4=false;
        resp5=true;
        int acerto=0, erro=0, x=0;
        x=(resp1==true)?acerto++:erro++;
        x=(resp2==true)?acerto++:erro++;
        x=(resp3==true)?acerto++:erro++;
        x=(resp4==true)?acerto++:erro++;
        x=(resp5==true)?acerto++:erro++;
        System.out.println("Numero Acertos:" +acerto);
        System.out.println("Numero Erros:" +erro);
    }

}