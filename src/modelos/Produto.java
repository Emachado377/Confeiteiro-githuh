package modelos;

public class Produto {
	private String nome;
	private String unidade;
	private int valorServico;

	public Produto() {
	}

	public Produto(String nome, String unidade, int valorServico) {
		this.nome = nome;
		this.unidade = unidade;
		this.valorServico = valorServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	public int getValorServico() {
		return valorServico;
	}

	public void setValorServico(int valorServico) {
		this.valorServico = valorServico;
	}
}
