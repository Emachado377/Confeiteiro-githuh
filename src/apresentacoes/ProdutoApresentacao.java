package apresentacoes;

import javax.swing.JOptionPane;
import modelos.Produto;

public class ProdutoApresentacao {

	public void cadastraProduto(Produto produto, String options[]) {
		produto.setNome(JOptionPane.showInputDialog("Cadastre um Produto:"));
		Object selectedValue = JOptionPane.showInputDialog(null, "Selecione uma unidade para o produto:", "Opçao",
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		String valor = (String) selectedValue;
		produto.setUnidade(valor);
	}

	public void listaProduto(String listaProduto) {
		JOptionPane.showMessageDialog(null, "Lista de Produtos Cadastrados" + "\n\n" + listaProduto);
	}

	public int selecionaProduto(String listaNomeProduto) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do produto:\n\n" + listaNomeProduto));
	}
}
