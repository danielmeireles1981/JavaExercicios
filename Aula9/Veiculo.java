/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9;

/**
 *
 * @author kees
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private double valorVenal;
    private boolean financiado;
    private int potenciaMotor;
    public static int quantidadeVeiculos;
    public Veiculo(){
        quantidadeVeiculos++;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    public void setanoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    public void setanoModelo(int anoModelo){
        this.anoModelo = anoModelo;
    }
    public void setvalorVenal(double valorVenal){
        this.valorVenal = valorVenal;
    }
    public void setfinanciado(boolean financiado){
        this.financiado = financiado;
    }
    public void setpotenciaMotor(int potenciaMotor){
        this.potenciaMotor = potenciaMotor;
    }
    public void setquantidadeVeiculos(int quantidadeVeiculos){
        this.quantidadeVeiculos = quantidadeVeiculos;
    }
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public int getanoFabricacao(){
        return anoFabricacao;
    }
    public int getanoModelo(){
        return anoModelo;
    }
    public double getvalorVenal(){
        return valorVenal;
    }
    public boolean getfinanciado(){
        return financiado;
    }
    public int getpotenciaMotor(){
        return potenciaMotor;
    }
    public static int getquantidadeVeiculos(){
        return quantidadeVeiculos;
    }
    public void imprimiDados(){
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Ano: " +anoFabricacao);
        System.out.println("Valor: " +valorVenal);
        System.out.println("Financiado: " +financiado);
        System.out.println("Motor: " +potenciaMotor);
        System.out.println("Qtde: " +quantidadeVeiculos);
    }    
}
