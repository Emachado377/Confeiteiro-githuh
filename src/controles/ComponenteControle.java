package controles;

import java.util.ArrayList;

import apresentacoes.ComponenteApresentacao;
import modelos.Componente;
import modelos.Insumo;
import modelos.Produto;

public class ComponenteControle {

	private ArrayList<Componente> listaComponentes = new ArrayList<Componente>();

	private ComponenteApresentacao componenteApresentacao = new ComponenteApresentacao();

	public void relacionarProdutoInsumo(Produto produto, Insumo insumo) {
		Componente componente = new Componente();
		componenteApresentacao.adicionaComponente(componente);
		componente.setProduto(produto);
		componente.setInsumo(insumo);
		listaComponentes.add(componente);
	}

	public void listaComponentePorProduto(Produto produto) {
		String listaComponenteTemporaria = "";
		int conta = 1;
		int n = listaComponentes.size();

		for (int i = 0; i < n; i++) {
			if ((listaComponentes.get(i).getProduto().getNome().equals(produto.getNome())) && conta == 0) {
				listaComponenteTemporaria += Integer.toString(i) + " - " + listaComponentes.get(i).getInsumo().getNome()
						+ " = " + listaComponentes.get(i).getQuantidadeInsumo() + " "
						+ listaComponentes.get(i).getInsumo().getUnidadeMedida() + "\n";

			} else if ((listaComponentes.get(i).getProduto().getNome().equals(produto.getNome())) && conta == 1) {
				conta = 0;
				listaComponenteTemporaria += Integer.toString(i) + "-" + listaComponentes.get(i).getProduto().getNome()
						+ ":" + "\n" + "- " + listaComponentes.get(i).getInsumo().getNome() + " = "
						+ listaComponentes.get(i).getQuantidadeInsumo() + " "
						+ listaComponentes.get(i).getInsumo().getUnidadeMedida() + "\n";
			}
		}
		componenteApresentacao.listaComponente(listaComponenteTemporaria);
	}

	public void populaComponente(Produto produto, Insumo insumo, double qtdInsumo) {
		Componente componente = new Componente();
		componente.setProduto(produto);
		componente.setInsumo(insumo);
		componente.setQuantidadeInsumo(qtdInsumo);
		listaComponentes.add(componente);
	}

}
