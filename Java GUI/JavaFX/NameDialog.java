import javax.swing.JOptionPane;

public class NameDialog 
{
	public static void main(String[] args) 
	{
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        String mensagem = String.format("Bem vindo, %s, a Programação em Java!", nome);
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
