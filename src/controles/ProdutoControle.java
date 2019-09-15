package controles;

import java.util.ArrayList;

import apresentacoes.ProdutoApresentacao;
import modelos.Produto;

public class ProdutoControle {
	
	private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	ProdutoApresentacao produtoApresentacao = new ProdutoApresentacao();

	
	public static void adicionaProduto () {
		Produto produto = new Produto();
		ProdutoApresentacao.cadastraProduto(produto);
		listaProduto.add(produto);
	}
	public static void listaProduto(){
		String listaNomeProdutoTemporaria = "";
		int n = listaProduto.size(); 
		for(int i =0; i<n; i++){
			listaNomeProdutoTemporaria+= Integer.toString(i)+ " - " +
					listaProduto.get(i).getNome()+"    "+ listaProduto.get(i).getUnidadeMedida() +" "+ listaProduto.get(i).getValor() + "\n";
		}
		ProdutoApresentacao.listaProduto(listaNomeProdutoTemporaria);
	}
	
}

