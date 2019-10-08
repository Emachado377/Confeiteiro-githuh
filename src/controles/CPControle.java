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
	ClienteControle clienteControle = new ClienteControle();
	PedidoControle pedidoControle = new PedidoControle();

	public CPControle() throws Exception {
		popula();
		int opcao = 4;
		do {
			opcao = cpApresentacao.menuPrincipal();
			if (opcao == 1) {
				int opcaomenu = 1;
				do {
					opcaomenu = menuInsumo(cpApresentacao.menuInsumo());
				} while (opcaomenu != 0);
			}

			if (opcao == 2) {
				int opcaomenu = 1;
				do {
					opcaomenu = menuProduto(cpApresentacao.menuProduto());
				} while (opcaomenu != 0);
			}

			if (opcao == 3) {
				int opcaomenu = 1;
				do {
					opcaomenu = menuComponente(cpApresentacao.menuComponente());
				} while (opcaomenu != 0);
			}

			if (opcao == 4) {
				int opcaomenu = 1;
				do {
					opcaomenu = menuCliente(cpApresentacao.menuCliente());
				} while (opcaomenu != 0);
			}

			if (opcao == 5) {
				int opcaomenu = 1;
				do {
					opcaomenu = menuPedido(cpApresentacao.menuPedido());
				} while (opcaomenu != 0);
			}

		} while (opcao > 0);
	}

	public int menuInsumo(int opcao) {
		if (opcao == 1) {
			insumoControle.adicionaInsumo();
		}
		if (opcao == 2) {
			insumoControle.listaInsumo();
		}
		if (opcao == 0) {
			return 0;
		}
		return 1;
	}

	public int menuProduto(int opcao) {
		if (opcao == 1) {
			produtoControle.adicionaProduto();
		}
		if (opcao == 2) {
			produtoControle.listaProduto();
		}
		if (opcao == 0) {
			return 0;
		}
		return 1;
	}

	public int menuComponente(int opcao) {
		if (opcao == 1) {
			componenteControle.relacionarProdutoInsumo(produtoControle.selecionaProduto(),
					insumoControle.selecionaInsumo());
		}
		if (opcao == 2) {
			componenteControle.listaComponentePorProduto(produtoControle.selecionaProduto());
		}
		if (opcao == 0) {
			return 0;
		}
		return 1;
	}

	public int menuCliente(int opcao) {
		if (opcao == 1) {
			clienteControle.adicionaCliente();
		}
		if (opcao == 2) {
			clienteControle.listaCliente();
		}
		if (opcao == 0) {
			return 0;
		}
		return 1;
	}

	public int menuPedido(int opcao) throws Exception {

		if (opcao == 1) {
			pedidoControle.adicionaPedido(clienteControle.selecionaCliente(), produtoControle.selecionaProduto());
		}
		if (opcao == 2) {
			pedidoControle.listaPedido();
		}
		if (opcao == 0) {
			return 0;
		}
		return 1;
	}

	public void popula() throws Exception {
		populaInsumos();
		populaProduto();
		populaComponente();
		populaCliente();
		populaPedido();
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
		insumoControle.populaInsumos("Guisado de Frango", "Kg", 8.00);

	}

	public void populaProduto() {
		produtoControle.populaProduto("Bolo Simples","Quilo",100);
		produtoControle.populaProduto("Bolo simples de coco com cobertura de chocolate","Quilo",100);
		produtoControle.populaProduto("Pastel de Carne","Unidade",100);
		produtoControle.populaProduto("Pastel de Frango","Unidade",100);

	}

	public void populaComponente() {
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(2), 0.50,"litro");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(3), 2.0,"xícara");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(0),
				insumoControle.obtemInsumoParaPopular(5), 1.5,"colher de sopa");

		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(1), 6.0,"unidade");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(4), 0.5,"xícara");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(1),
				insumoControle.obtemInsumoParaPopular(6), 3.0,"colher de sopa");

		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(9), 50.0,"grama");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(1), 1.0,"unidade");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(2),
				insumoControle.obtemInsumoParaPopular(5), 1.0,"Colher de chá");

		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(10), 50.0,"grama");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(1), 1.0,"unidade");
		componenteControle.populaComponente(produtoControle.obtemProdutoParaPopular(3),
				insumoControle.obtemInsumoParaPopular(8), 0.5,"colher de chá");
	}

	public void populaCliente() {
		clienteControle.populaCliente("Evandro", "981223441");
		clienteControle.populaCliente("Tiago", "981623661");
		clienteControle.populaCliente("Maria", "981925881");
		clienteControle.populaCliente("João", "981229851");
		clienteControle.populaCliente("Vagner", "981233447");
		clienteControle.populaCliente("Patricia", "98254645");
	}

	public void populaPedido() throws Exception {
		pedidoControle.populaPedido(clienteControle.obtemClienteParaPopular(0),
				produtoControle.obtemProdutoParaPopular(0), 2.0, "10/10/2019");
		pedidoControle.populaPedido(clienteControle.obtemClienteParaPopular(1),
				produtoControle.obtemProdutoParaPopular(1), 3.0, "01/12/2019");
		pedidoControle.populaPedido(clienteControle.obtemClienteParaPopular(2),
				produtoControle.obtemProdutoParaPopular(2), 50.0, "07/01/2020");
		pedidoControle.populaPedido(clienteControle.obtemClienteParaPopular(3),
				produtoControle.obtemProdutoParaPopular(3), 30.0, "05/11/2019");
	}
}
