package controles;

import apresentacoes.CPApresentacao;
import controles.InsumoControle;
import controles.ProdutoControle;
import controles.ComponenteControle;
import controles.ClienteControle;

public class CPControle {

	CPApresentacao cpApresentacao = new CPApresentacao();
	InsumoControle insumoControle = new InsumoControle();
	ProdutoControle produtoControle = new ProdutoControle();
	ComponenteControle componenteControle = new ComponenteControle();
	ClienteControle  clienteControle = new ClienteControle();
	

	public CPControle() {
		popula();
		int opcao = 4;
		do {
			opcao = cpApresentacao.menuPrincipal();
			if (opcao == 1) {
				menuInsumo(cpApresentacao.menuInsumo());
			}
			if (opcao == 2) {
				menuProduto(cpApresentacao.menuProduto());
			}
			if (opcao == 3) {
				menuComponente(cpApresentacao.menuComponente());
			}
			if (opcao == 4) {
				menuCliente(cpApresentacao.menuCliente());
			}
			if (opcao == 5) {
				// menuCurso(cpApresentacao.menuPedido());
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

	public void menuComponente(int opcao) {
		if (opcao == 1) {
			componenteControle.relacionarProdutoInsumo(produtoControle.selecionaProduto(),
					insumoControle.selecionaInsumo());
		}
		if (opcao == 2) {
			componenteControle.listaComponentePorProduto(produtoControle.selecionaProduto());
		}
	}
	public void menuCliente(int opcao) {
		if (opcao == 1) {
			clienteControle.adicionaCliente();
		}
		if (opcao == 2) {
			clienteControle.listaCliente();
		}
	}

	public void popula() {
		populaInsumos();
		populaProduto();
		populaComponente();
		populaCliente();
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

	public void populaComponente() {
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(2), 0.50);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(3), 2.0);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(5), 1.5);

		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(1), 2.0);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(4), 1.5);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(6), 0.5);

		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(9), 1.0);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(1), 0.5);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(5), 2.0);
		
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(10), 1.0);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(1), 0.5);
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(8), 0.3);
			}
	
	public void populaCliente() {
		clienteControle.populaCliente("Evandro", "981223441");
		clienteControle.populaCliente("Tiago", "981623661");
		clienteControle.populaCliente("Maria", "981925881");
		clienteControle.populaCliente("João", "981229851");
		clienteControle.populaCliente("Vagner", "981233447");
		clienteControle.populaCliente("Patricia", "98254645");
		}
}
