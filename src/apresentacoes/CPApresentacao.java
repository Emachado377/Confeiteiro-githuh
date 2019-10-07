package apresentacoes;

import javax.swing.JOptionPane;

public class CPApresentacao {

	public int menuPrincipal() {
		int opcaoMenuPrincipal;
		opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu Principal:\n1-Insumo\n2-Produto\n3-Componente\n4-Cliente\n5-Pedido\n0-Sair"));
		return opcaoMenuPrincipal;
	}

	public int menuInsumo() {
		int opcaoMenuInsumo;
		opcaoMenuInsumo = Integer
				.parseInt(JOptionPane.showInputDialog(null, "\tMenu de Insumos:\n1-Adicionar\n2-Listar\n0-Sair"));
		return opcaoMenuInsumo;
	}

	public int menuProduto() {
		int opcaoMenuProduto;
		opcaoMenuProduto = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu de Produtos:\n1-Cadastro Produto\n2-Listar de Produtos\n0-Sair"));
		return opcaoMenuProduto;
	}

	public int menuComponente() {
		int opcaoMenuComponente;
		opcaoMenuComponente = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu de Componentes\n1-Atribuir Insumos ao Produto \n2-Listar Componentes\n0-Sair"));
		return opcaoMenuComponente;
	}

	public int menuCliente() {
		int opcaoMenuCliente;
		opcaoMenuCliente = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu de Clientes\n1-Cadastro de Cliente \n2-Listar de Clientes \n0-Sair"));
		return opcaoMenuCliente;
	}

	public int menuPedido() {
		int opcaoMenuPedido;
		opcaoMenuPedido = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu de Clientes\n1-Adicionar Pedido \n2-Listar de Pedidos \n0-Sair"));
		return opcaoMenuPedido;
	}
}
