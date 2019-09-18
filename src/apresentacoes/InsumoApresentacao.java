package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Insumo;

public class InsumoApresentacao {

	public static void cadastraInsumo(Insumo insumo, String options[]) {
		insumo.setNome(JOptionPane.showInputDialog("Digite o nome do Insumo:"));		
		Object selectedValue = JOptionPane.showInputDialog(null,
		"Escolha um item", "Opçao",	JOptionPane.INFORMATION_MESSAGE, null,	options, options [0]); 	
		String valor = (String) selectedValue;
		insumo.setUnidadeMedida (valor);
		insumo.setValor(Double.parseDouble((JOptionPane.showInputDialog("Digite o Valor:"))));
	}

	public static void listaInsumo(String listaInsumo) {
		JOptionPane.showMessageDialog(null, listaInsumo);
	}
}