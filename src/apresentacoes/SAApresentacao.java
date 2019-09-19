package apresentacoes;

import javax.swing.JOptionPane;

public class SAApresentacao {

	public int menuPrincipal() {
		int opcaoMenuPrincipal;
		opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu Principal:\n1-Insumo\n2-Produto\n3-Cliente\n4-Pedido\n0-Sair"));
		return opcaoMenuPrincipal;
	}
	public int menuInsumo(){
		int opcaoMenuInsumo;
		opcaoMenuInsumo = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tMenu de Insumo:\n1-Adicionar\n2-Listar\n3-Atualizar Preço\n0-Sair")
		);
		return opcaoMenuInsumo;
	}
	
	public int menuProduto(){
		int opcaoMenuProduto;
		opcaoMenuProduto = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tMenu de Produtos:\n1-Cadastro Produto\n2-Listar de Produtos\n3-Cadastrar Itens\n0-Sair")
		);
		return opcaoMenuProduto;
	}
	
}



