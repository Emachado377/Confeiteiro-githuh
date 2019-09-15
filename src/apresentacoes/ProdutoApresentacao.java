package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Produto;

public class ProdutoApresentacao {

	public static void cadastraProduto(Produto produto) {
		produto.setNome(JOptionPane.showInputDialog("Digite o nome do Produto:"));
		produto.setUnidadeMedida(JOptionPane.showInputDialog("Selecione a Unidade de medida do Produto:"));
		produto.setValor(Double.parseDouble((JOptionPane.showInputDialog("Digite o Valor:"))));
	}
	
	public static void listaProduto(String listaProduto){
		JOptionPane.showMessageDialog(null, listaProduto);
	}
}