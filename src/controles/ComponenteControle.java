package controles;

import java.util.ArrayList;

import apresentacoes.ComponenteApresentacao;
import modelos.Componente;
import modelos.Insumo;
import modelos.Produto;

public class ComponenteControle {

	private ArrayList<Componente> listaComponentes = new ArrayList<Componente>();
	
	public String[] optionsUnidadeMedidaInsumo = { "xícara", "colher de sopa", "colher de chá", "unidade", "kg", "quilo", "miligramas", "litro","mililitros", "metros", "milimetros" };

	private ComponenteApresentacao componenteApresentacao = new ComponenteApresentacao();

	public void relacionarProdutoInsumo(Produto produto, Insumo insumo) {
		Componente componente = new Componente();
		componente.setProduto(produto);
		componente.setInsumo(insumo);
		componenteApresentacao.adicionaComponente(componente,optionsUnidadeMedidaInsumo);
		listaComponentes.add(componente);
	}

	public void listaComponentePorProduto(Produto produto) {
		String listaComponenteTemporaria = "";
		int n = listaComponentes.size();

		for (int i = 0; i < n; i++) {
			if ((listaComponentes.get(i).getProduto().getNome().equals(produto.getNome()))) {

				listaComponenteTemporaria += Integer.toString(i) + "-" + listaComponentes.get(i).getProduto().getNome()
						+ ":" + "\n" + "     - " + listaComponentes.get(i).getInsumo().getNome() + " = "
						+ listaComponentes.get(i).getQuantidadeInsumo() + " "
						+ listaComponentes.get(i).getUnidadeMedidaInsumo() + "\n";
			}
		}
		componenteApresentacao.listaComponente(listaComponenteTemporaria);
	}

	public void populaComponente(Produto produto, Insumo insumo, double qtdInsumo, String unidadeMedidaInsumo ) {
		Componente componente = new Componente();
		componente.setProduto(produto);
		componente.setInsumo(insumo);
		componente.setQuantidadeInsumo(qtdInsumo);
		componente.setUnidadeMedidaInsumo(unidadeMedidaInsumo);
		
		listaComponentes.add(componente);
	}
}
