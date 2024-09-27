//package aula2;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kees
 * KESS JAVA - Módulo 1
 */
public class Exercicio1 {
    public static void main (String [] args)
    {
     int simples=1;
     String referencia="Java";
     int num2=1;
     String ref2="JaVa";
     String resposta1, resposta2, resposta3, resposta4;
     resposta1=(simples==num2)?"true":"false";
     resposta2=(simples!=num2)?"true":"false";
     resposta3=(referencia==ref2)?"true":"false";
     resposta4=(referencia!=ref2)?"true":"false";
     System.out.println(resposta1);
     System.out.println(resposta2);
     System.out.println(resposta3);
     System.out.println(resposta4);
    }

}
