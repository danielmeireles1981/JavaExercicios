/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public class ContaSalario extends ContaBancaria implements OperacoesBancarias{
    
    private static int totalSalario=0;
    
    public ContaSalario(){
        totalSalario++;
    }
    
    public boolean verificarUsoLimite(){
        if(this.obterSaldo() >= 0 ){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static int getTotalSalario(){
        return totalSalario;
    }
    
    public void debitarMensalidade(double valor){
        sacar(valor);
    }
    
    public void cobrarTarifaDeSaque(double tarifa){
        sacar(tarifa);
    }
    
    public boolean creditarValorIndevido(double valor){
        depositar(valor);
        return true;
    }
    
    public void cobrarTarifaDeDeposito(double tarifa){
        depositar(tarifa);
    }
    
    @Override
    public double obterSaldo(){
        return super.obterSaldo();
    }
    
    public double verificarQuantiaUsadaEspecial(){
        if (obterSaldo() <00.00)
            return (obterSaldo()*(-1.00));
        else
            return 00.00;
    }

}