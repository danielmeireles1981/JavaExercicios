/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
public interface OperacoesBancarias {
    
    public void cobrarTarifaDeSaque(double tarifa);
    
    public boolean creditarValorIndevido(double valor);
    
    public double obterSaldo();
    
    public double verificarQuantiaUsadaEspecial();
    
    public void cobrarTarifaDeDeposito(double tarifa);

}
