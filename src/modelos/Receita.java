package modelos;

public class Receita {
	private String nome;	
	
	public Receita(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nReceita = " + nome + "\n";
	}
	
	
}

