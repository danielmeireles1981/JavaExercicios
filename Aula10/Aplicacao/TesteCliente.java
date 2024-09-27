/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Aplicacao;

/**
 *
 * @author kees
 */
import ClassesDAO.cliente;
public class TesteCliente {
    public static void main(String[] args){
        cliente jose = new cliente();
        
        jose.setnome("Jose de Souza");
        jose.setidade(30);
        
        System.out.println("Nome: " +(jose.getnome()));
        System.out.println("Idade: " +(jose.getidade()));
        
    }

}
