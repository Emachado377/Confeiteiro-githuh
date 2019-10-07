package controles;

import java.util.ArrayList;
import apresentacoes.InsumoApresentacao;
import modelos.Insumo;

public class InsumoControle {

	InsumoApresentacao insumoApresentacao = new InsumoApresentacao();

	public ArrayList<Insumo> listaInsumos = new ArrayList<Insumo>();
	public String[] options = { "kg", "g", "mg", "l", "ml", "duzia", "m", "cm", "mm" };

	public void adicionaInsumo() {
		Insumo insumo = new Insumo();
		insumoApresentacao.cadastraInsumo(insumo, options);
		listaInsumos.add(insumo);
	}

	public Insumo selecionaInsumo() {
		String listaNomeInsumoTemporaria = "";
		int n = listaInsumos.size();
		for (int i = 0; i < n; i++) {
			listaNomeInsumoTemporaria += Integer.toString(i) + " - " + listaInsumos.get(i).getNome() + "\n";
		}
		int idInsumo = insumoApresentacao.selecionaInsumo(listaNomeInsumoTemporaria);
		return listaInsumos.get(idInsumo);
	}

	public void listaInsumo() {
		String listaNomeInsumoTemporaria = "";
		int n = listaInsumos.size();
		for (int i = 0; i < n; i++) {
			listaNomeInsumoTemporaria += Integer.toString(i) + " - " + listaInsumos.get(i).getNome() + "  =  "
					+ listaInsumos.get(i).getValor() + " /  " + listaInsumos.get(i).getUnidadeMedida() + "\n\n";
		}
		insumoApresentacao.listaInsumo(listaNomeInsumoTemporaria);
	}

	public void populaInsumos(String nome, String unidadeMedida, Double valor) {
		Insumo insumo = new Insumo();
		insumo.setNome(nome);
		insumo.setUnidadeMedida(unidadeMedida);
		insumo.setValor(valor);
		listaInsumos.add(insumo);
	}

	public Insumo obtemInsumoParaPopular(int idInsumo) {
		return listaInsumos.get(idInsumo);
	}
}
