package controles;

import java.util.ArrayList;

import apresentacoes.ProdutoApresentacao;
import modelos.Produto;

public class ProdutoControle {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	private ProdutoApresentacao produtoApresentacao = new ProdutoApresentacao();

	public void adicionaProduto() {
		Produto produto = new Produto();
		produtoApresentacao.cadastraProduto(produto);
		listaProdutos.add(produto);
	}

	public void listaProduto() {
		String listaProdutoTemporaria = "";
		int n = listaProdutos.size();
		for (int i = 0; i < n; i++) {
			listaProdutoTemporaria += Integer.toString(i) + " - " + listaProdutos.get(i).getNome() + "\n";
		}

		produtoApresentacao.listaProduto(listaProdutoTemporaria);
	}
	
	public void populaProduto(String nome) {
		Produto produto = new Produto();
		produto.setNome(nome);
		listaProdutos.add(produto);
	}
}
