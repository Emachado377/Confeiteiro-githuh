package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Produto;

public class ProdutoApresentacao {

	public static void cadastraProduto(Produto produto, String options[]) {
		produto.setNome(JOptionPane.showInputDialog("Digite o nome do Produto:"));
		int tipoMedida = JOptionPane.showOptionDialog(null,
				"Informe a Unidade de medida : ", "Produto", 0, -1, null,options, null);
		if (tipoMedida == 0) {
			produto.setUnidadeMedida ("Kg");
			
		} else  {
			produto.setUnidadeMedida ("Litro");
		
		} 
		if (tipoMedida == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		produto.setValor(Double.parseDouble((JOptionPane.showInputDialog("Digite o Valor:"))));
	}

	public static void listaProduto(String listaProduto) {
		JOptionPane.showMessageDialog(null, listaProduto);
	}
}