package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Insumo;

public class InsumoApresentacao {

	public static void cadastraInsumo(Insumo insumo, String options[]) {
		insumo.setNome(JOptionPane.showInputDialog("Digite o nome do Insumo:"));
		int tipoMedida = JOptionPane.showOptionDialog(null,
				"Informe a Unidade de medida : ", "Insumo", 0, -1, null,options, null);
		if (tipoMedida == 0) {
			insumo.setUnidadeMedida ("Kg");
			
		} else  {
			insumo.setUnidadeMedida ("Litro");
		
		} 
		if (tipoMedida == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
		insumo.setValor(Double.parseDouble((JOptionPane.showInputDialog("Digite o Valor:"))));
	}

	public static void listaInsumo(String listaInsumo) {
		JOptionPane.showMessageDialog(null, listaInsumo);
	}
}