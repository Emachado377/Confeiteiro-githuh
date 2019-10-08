package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Componente;


public class ComponenteApresentacao {

	public void adicionaComponente(Componente componente, String[] options) {
		
		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao",
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		String valor = (String) selectedValue;
		componente.setUnidadeMedidaInsumo(valor);
		double qtdInsumo = Double.parseDouble(JOptionPane.showInputDialog(
				"Informe a quantidade de "+ valor + " de " + componente.getInsumo().getNome()+" : "));

		componente.setQuantidadeInsumo(qtdInsumo);
	}

	public void listaComponente(String listaComponente) {
		JOptionPane.showMessageDialog(null, listaComponente);
	}
}
