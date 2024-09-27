/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9;

/**
 *
 * @author kees
 */
public class ex4 {
    public static void main (String [] args){
        Veiculo palio = new Veiculo();
        Veiculo gol = new Veiculo();
        
        Pessoa chico = new Pessoa();
        Pessoa kika = new Pessoa();
        
        //pailo
        palio.setmarca("fiat");
        palio.setmodelo("2008");
        palio.setanoFabricacao(2007);
        palio.setvalorVenal(30.000);
        palio.setfinanciado(true);
        palio.setpotenciaMotor(20);
        palio.setquantidadeVeiculos(1);
        
        //gol
        gol.setmarca("volks");
        gol.setmodelo("2008");
        gol.setanoFabricacao(2007);
        gol.setvalorVenal(30.000);
        gol.setfinanciado(false);
        gol.setpotenciaMotor(20);
        gol.setquantidadeVeiculos(1);
        
        //chico
        chico.setrg("12345678");
        chico.setcpf("12321233");
        chico.setdataNascimento("10/12/1979");
        chico.setnome("Francisco Jackson Sanches");
        chico.setidadeAtual(28);
        
        //kika
        kika.setrg("12345678");
        kika.setcpf("12321233");
        kika.setdataNascimento("10/12/1979");
        kika.setnome("Francisca Josias da Silva");
        kika.setidadeAtual(28);
        
        gol.imprimiDados();
        palio.imprimiDados();
        chico.imprimiDados();
        kika.imprimiDados();
        
        System.out.println("-----------");
        System.out.println("Gol");
        System.out.println(gol.getmarca());
        System.out.println(gol.getmodelo());
        System.out.println(gol.getanoFabricacao());
        System.out.println(gol.getvalorVenal());
        System.out.println(gol.getpotenciaMotor());
        System.out.println(gol.getquantidadeVeiculos());
        
        System.out.println("-----------");
        System.out.println("Qtde Veiculos: " +Veiculo.getquantidadeVeiculos());
        
        //fazer para pessoas o mesmo acima....
    }

}
