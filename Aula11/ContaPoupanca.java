/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ContaPoupanca extends ContaBancaria {
    
    private static int totalPoupancas;
    
    //ContaPoucpanca x = new ContaPoupanca();
    public ContaPoupanca(){
        totalPoupancas++;
    }
            
    public boolean verificarUsoLimite(){
        return false;
    }
    
    //int aux = ContaPoupanca.getTotalPoupancas();
    public static int getTotalPoupancas(){
        return totalPoupancas;
    }
    
    public void aplicarRendimento(double taxa){
        double aux = obterSaldo() * taxa;
        depositar(aux);
    }
    
    public void cobrarTarifaDeSaque(double tarifa){
        this.sacar(tarifa);
    }
    
    public boolean creditarValorIndevido(double valor){
        return true;
    }
    
}

