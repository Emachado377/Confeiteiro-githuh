package apresentacoes;

import javax.swing.JOptionPane;

public class SAApresentacao {

	public int menuPrincipal() {
		int opcaoMenuPrincipal;
		opcaoMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"\tMenu Pricipal\n1-Insumo\n2-Produto\n3-Cliente\n4-Pedido\n0-Sair"));
		return opcaoMenuPrincipal;
	}
	public int menuInsumo(){
		int opcaoMenuInsumo;
		opcaoMenuInsumo = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tMenu Insumo\n1-Adicionar\n2-Listar\n0-Sair")
		);
		return opcaoMenuInsumo;
	}
	
}

