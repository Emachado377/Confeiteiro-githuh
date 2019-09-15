package apresentacoes;

import javax.swing.JOptionPane;

public class SAApresentacao {

	public int menuPrincipal() {
		int opcaoMenuPrincipal;
		opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu Pricipal\n1-Produtos\n2-Receitas\n3-Cliente\n4-Pedido\n0-Sair"));
		return opcaoMenuPrincipal;
	}
	public int menuProduto(){
		int opcaoMenuProduto;
		opcaoMenuProduto = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tMenu Produto\n1-Adicionar\n2-Listar\n0-Sair")
		);
		return opcaoMenuProduto;
	}
	
}

