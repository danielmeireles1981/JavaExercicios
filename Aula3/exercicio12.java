import javax.swing.JOptionPane;
public class exercicio12 {
    public static void main (String [] args){
        String nome="";
        nome=JOptionPane.showInputDialog("Digite seu nome:");
        String idade="";
        idade=JOptionPane.showInputDialog("Digite sua idade");
        String email="";
        email=JOptionPane.showInputDialog("Digite seu email:");
        String tel="";
        tel=JOptionPane.showInputDialog("Digite seu telefone");
        JOptionPane.showMessageDialog(null,"Nome: " +nome +"\n Idade: " +idade +"\n Email: " +email +"\n Telefone: " +tel);
    }
}