package controles;

import java.util.ArrayList;

import apresentacoes.ProdutoApresentacao;
import modelos.Produto;

public class ProdutoControle {
	
	static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    public static  String[] options = { "Kg", "Litro"};
    
	
	public static void adicionaProduto () {
		Produto produto = new Produto();
		ProdutoApresentacao.cadastraProduto(produto, options);
		listaProdutos.add(produto);
	}
	public static void listaProduto(){
		String listaNomeProdutoTemporaria = "";
		int n = listaProdutos.size(); 
		for(int i =0; i<n; i++){
			listaNomeProdutoTemporaria+= Integer.toString(i)+ " - " +
					listaProdutos.get(i).getNome()+"  =  "+ listaProdutos.get(i).getValor() +" /  "+ listaProdutos.get(i).getUnidadeMedida() + "\n\n";
		}
		ProdutoApresentacao.listaProduto(listaNomeProdutoTemporaria);
	}
	
}

