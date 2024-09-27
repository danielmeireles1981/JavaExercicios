/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ContaInvestimento extends ContaBancaria {
    
    private static int totalInvestimento;
    
    public ContaInvestimento(){
        totalInvestimento++;
    }
    
    public boolean verificarUsoLimite(){
        return false;
    }
    
    public static int getTotalInvestimento(){
        return totalInvestimento;
    }
    
    public void aplicarRendimento(double taxa){
        
    }
    
    public void cobrarTarifaDeSaque(double tarifa){
        this.sacar(tarifa);
    }
    
    public boolean creditarValorIndevido(double valor){
        this.depositar(valor);
        return true;
    }
    
    public void cobrarTarifaDeDeposito(double tarifa){
        this.depositar(tarifa);
    }

}
