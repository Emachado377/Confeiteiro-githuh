package modelos;

import modelos.Produto;
import modelos.Receita;

public class Ingrediente {
	 private Receita receita;	 
	 private Produto produto;
	 private Double quantidadeReceita;
	 private Double quantidadeProduto;
	 
	 
	public Ingrediente(Receita receita, Produto produto,Double quantidadeReceita, Double quantidadeProduto) {
		this.receita = receita;
		this.produto = produto;
		this.quantidadeProduto = quantidadeReceita;
		this.quantidadeProduto = quantidadeProduto;
	}


	public Receita getReceita() {
		return receita;
	}


	public void setReceita(Receita receita) {
		this.receita = receita;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Double getQuantidadeReceita() {
		return quantidadeReceita;
	}


	public void setQuantidadeReceita(Double quantidadeReceita) {
		this.quantidadeReceita = quantidadeReceita;
	}


	public Double getQuantidadeProduto() {
		return quantidadeProduto;
	}


	public void setQuantidadeProduto(Double quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}