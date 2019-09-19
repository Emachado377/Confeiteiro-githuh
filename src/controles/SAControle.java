package controles;

import apresentacoes.SAApresentacao;
import controles.InsumoControle;
import controles.ProdutoControle;

public class SAControle {
	
	SAApresentacao saApresentacao = new SAApresentacao();
	InsumoControle insumoControle = new InsumoControle();
	ProdutoControle produtoControle = new ProdutoControle();
	
	public SAControle() {
		popula();
		int opcao = 4;
		do {
			opcao = saApresentacao.menuPrincipal();
			if (opcao == 1) {
				menuInsumo(saApresentacao.menuInsumo());
			}
			if (opcao == 2) {
				menuProduto(saApresentacao.menuProduto());
			}
			if (opcao == 3) {
				//menu(saApresentacao.menuCliente());
			}
			if (opcao == 4) {
				//menuCurso(saApresentacao.menuPedido());
			}
			
		} while (opcao > 0);
	}
	
	public void menuInsumo(int opcao) {
		if (opcao == 1) {
			insumoControle.adicionaInsumo();
		}
		if (opcao == 2) {
			insumoControle.listaInsumo();
		}
	}
	public void menuProduto(int opcao) {
		if (opcao == 1) {
			produtoControle.adicionaProduto();
		}
		if (opcao == 2) {
			produtoControle.listaProduto();
		}
	}
	
	
	public void popula() {
		populaInsumos();
		populaProduto();
		}
	
	public void populaInsumos() {		
		insumoControle.populaInsumos("Farinha de trigo", "Kg", 12.00);
		insumoControle.populaInsumos("Ovos", "Duzia", 10.00);		
		insumoControle.populaInsumos("Leite", "Litro", 4.00);
		insumoControle.populaInsumos("Açucar", "Kg", 8.00);
		insumoControle.populaInsumos("Fermento em pó", "Litro", 4.00);
		insumoControle.populaInsumos("Margarina", "Kg", 8.00);
		insumoControle.populaInsumos("Coco ralado", "Kg", 8.00);
		insumoControle.populaInsumos("Achocolatado", "Kg", 8.00);
		insumoControle.populaInsumos("Sal", "Kg", 8.00);
		insumoControle.populaInsumos("Guisado de Gado", "Kg", 8.00);
		insumoControle.populaInsumos("Guisado de Frngo", "Kg", 8.00);
		
		}
	
	public void populaProduto() {		
		produtoControle.populaProduto("Bolo Simples");
		produtoControle.populaProduto("Bolo simples de coco com cobertura de chocolate");
		produtoControle.populaProduto("Pastel de Carne");
		produtoControle.populaProduto("Pastel de Frango");
		
		}
}
