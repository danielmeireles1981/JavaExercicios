/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassesDAO;

/**
 *
 * @author kees
 */
public class cliente {
    
    private String nome;
    private int idade;
    
    public cliente(){    
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setidade(int idade){
        this.idade = idade;
    }
    public String getnome(){
        return nome;
    }
    public int getidade(){
        return idade;
    }

}
