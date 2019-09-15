package modelos;

public class Produto {
	private String nome;
	private String unidadeMedida;
	private Double valor;

	public Produto() {
	}

	public Produto (String nome, String unidadeMedida, double valor) {
		this.nome = nome;
		this.unidadeMedida = unidadeMedida;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	

	public String toString() {
		return "\nProduto=" + nome + "\nUnidade de Medida=" + unidadeMedida + "\nValor do Produto = "
				+ valor + "\n";
	}	
	
	
}
