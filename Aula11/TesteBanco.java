/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author kees
 */
import javax.swing.*;
public class TesteBanco implements OperacoesBancarias{
    public static void main (String [] args){
        
        ContaSalario conta1 = new ContaSalario();
        
        String aux = new String();
        
        aux = JOptionPane.showInputDialog("Digite quantia");
        conta1.sacar(Double.parseDouble(aux));
        conta1.cobrarTarifaDeSaque(1);
        
        System.out.println(conta1.obterSaldo());
    }

    public void cobrarTarifaDeSaque(double tarifa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean creditarValorIndevido(double valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double obterSaldo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double verificarQuantiaUsadaEspecial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cobrarTarifaDeDeposito(double tarifa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
