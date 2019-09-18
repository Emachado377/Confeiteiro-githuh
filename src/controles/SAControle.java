package controles;

import apresentacoes.SAApresentacao;

public class SAControle {
	
	SAApresentacao saApresentacao = new SAApresentacao();
	
	public SAControle() {
		int opcao = 4;
		do {
			opcao = saApresentacao.menuPrincipal();
			if (opcao == 1) {
				menuInsumo(saApresentacao.menuInsumo());
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
	
	public void menuInsumo(int opcao) {
		if (opcao == 1) {
			InsumoControle.adicionaInsumo();
		}
		if (opcao == 2) {
			InsumoControle.listaInsumo();
		}
	}
}
