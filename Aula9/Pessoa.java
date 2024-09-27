/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9;

/**
 *
 * @author kees
 */
public class Pessoa {
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String nome;
    private int idadeAtual;
    
    public Pessoa(){
        rg = "";
        cpf = "";
        dataNascimento = "";
        nome = "";
        idadeAtual = 0;
    }
    
    public Pessoa(String rg, String cpf, String dataNascimento, String nome, int idadeAtual){
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.idadeAtual = idadeAtual;       
    }
    
    public void setrg(String rg){
        this.rg = rg;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public void setdataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setidadeAtual(int idadeAtual){
        this.idadeAtual = idadeAtual;
    }
    public String getrg(){
        return rg;
    }
    public String getcpf(){
        return cpf;
    }
    public String getdataNascimento(){
        return dataNascimento;
    }
    public String getnome(){
        return nome;
    }
    public int getidadeAtuak(){
        return idadeAtual;
    }
    public void imprimiDados(){
        System.out.println("RG: " +rg);
        System.out.println("CPF: " +cpf);
        System.out.println("Dt Nascimento: " +dataNascimento);
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idadeAtual);
    }
    public void imprimDados(){
        String msg = "MESSAGE";
        System.out.println(msg);
    }
}
