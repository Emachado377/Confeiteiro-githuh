package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Produto;

public class ProdutoApresentacao {

	public static void cadastraProduto(Produto produto) {
		produto.setNome(JOptionPane.showInputDialog("Digite o nome do Produto:"));
		produto.setUnidadeMedida(JOptionPane.showInputDialog("Digite a unidade de medida:"));
		/*produto.setUnidadeMedida(JOptionPane.showOptionDialog(null,"Unidade de Medida do Produto", 
				"Selecione a unidade de medida:",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null, options, options[0]);*/
		
		produto.setValor(Double.parseDouble((JOptionPane.showInputDialog("Digite o Valor:"))));
	}
	
	public static void listaProduto(String listaProduto){
		JOptionPane.showMessageDialog(null, listaProduto);
	}
}