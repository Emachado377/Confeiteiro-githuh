package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Componente;


public class ComponenteApresentacao {

	public void adicionaComponente(Componente componente) {

		double qtdInsumo = Double.parseDouble(JOptionPane.showInputDialog(
				"Informe a quantidade do insumo:\n" + " ( " + componente.getInsumo().getUnidadeMedida() + " ) "));

		componente.setQuantidadeInsumo(qtdInsumo);
	}

	public void listaComponente(String listaComponente) {
		JOptionPane.showMessageDialog(null, listaComponente);
	}
}
