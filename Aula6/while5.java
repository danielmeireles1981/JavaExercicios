/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
public class while5 {
    public static void main(String []args){
        int vetor[] = {0,4,77,3,2};
        int i, par=0, impar=0, zero=0;
        for (i=0; i<5; i++){
            if (vetor[i]%2==0)
                par++;
            else impar++;
            if (vetor[i]==0)
                zero++;
        }
        System.out.println("Par: \n" +par +"Impar: \n" +impar +"Zero: \n" +zero);
    }

}
