/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author java
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class estacoes {
    public static void main (String []args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
            String mes="";
            System.out.print("Digite mes:");
            try{
                mes=dataIn.readLine();
            }catch( IOException e){
                System.out.print("Erro");
            }
        int num=0;
        num=Integer.parseInt(mes);
        switch (num){
            case 1:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Verao");
                break;
            case 2:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Verao");
                break;
            case 3:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Verao");
                break;
            case 4:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Outono");
                break;
            case 5:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Outono");
                break;
            case 6:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Outono");
                break;
            case 7:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Inverno");
                break;
            case 8:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Inverno");
                break;
            case 9:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Inverno");
                break;    
            case 10:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Primavera");
                break;
            case 11:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Primavera");
                break;
            case 12:
                System.out.println("A estacao do ano correspondente ao mes " +mes +" é Primavera");
                break;
        }      
        
    }

}
