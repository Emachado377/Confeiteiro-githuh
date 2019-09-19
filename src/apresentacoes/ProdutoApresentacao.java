package apresentacoes;

import javax.swing.JOptionPane;
import modelos.Produto;

public class ProdutoApresentacao {
	
	
	public void cadastraProduto(Produto produto) {
		produto.setNome(JOptionPane.showInputDialog("Cadastre um produto:"));
		
	}
	
	
	public void listaProduto(String listaProduto){
		JOptionPane.showMessageDialog(null, "\tLista de Produtos" + "\n\n" + listaProduto);
	}
	
	
	public int selecionaProduto(String listaNomeProduto){
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do produto:\n\n" + listaNomeProduto));
	}
}
