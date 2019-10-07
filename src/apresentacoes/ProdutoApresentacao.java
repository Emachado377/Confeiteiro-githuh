package apresentacoes;

import javax.swing.JOptionPane;
import modelos.Produto;

public class ProdutoApresentacao {

	public void cadastraProduto(Produto produto) {
		produto.setNome(JOptionPane.showInputDialog("Cadastre um Produto:"));

	}

	public void listaProduto(String listaProduto) {
		JOptionPane.showMessageDialog(null, "Lista de Produtos Cadastrados" + "\n\n" + listaProduto);
	}

	public int selecionaProduto(String listaNomeProduto) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do produto:\n\n" + listaNomeProduto));
	}
}
