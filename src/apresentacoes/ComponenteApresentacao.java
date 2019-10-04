package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Componente;

public class ComponenteApresentacao {

	Componente componente = new Componente();

	public void adicionaComponente(Componente componente) {
		double qtdProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto:"));
		double qtdInsumo = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do insumo:"));
		componente.setQuantidadeProduto(qtdProduto);
		componente.setQuantidadeInsumo(qtdInsumo);
	}

	public void listaComponente(String listaComponente) {
		JOptionPane.showMessageDialog(null, listaComponente);
	}
}
