/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public abstract class ContaBancaria {
    private double saldo;
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
    
    public double obterSaldo(){
        return saldo;
    }
    
    public abstract boolean verificarUsoLimite();
    
}
