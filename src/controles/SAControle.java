package controles;

import apresentacoes.SAApresentacao;

public class SAControle {
	
	SAApresentacao saApresentacao = new SAApresentacao();
	
	public SAControle() {
		int opcao = 4;
		do {
			opcao = saApresentacao.menuPrincipal();
			if (opcao == 1) {
				menuProduto(saApresentacao.menuProduto());
			}
			if (opcao == 2) {
				//menuDisciplina(saApresentacao.menuReceita());
			}
			if (opcao == 3) {
				//menuMatricula(saApresentacao.menuCliente());
			}
			if (opcao == 4) {
				//menuCurso(saApresentacao.menuPedido());
			}
			
		} while (opcao > 0);
	}
	
	public void menuProduto(int opcao) {
		if (opcao == 1) {
			ProdutoControle.adicionaProduto();
		}
		if (opcao == 2) {
			ProdutoControle.listaProduto();
		}
	}
}
