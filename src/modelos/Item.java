package modelos;

import modelos.Insumo;
import modelos.Produto;

public class Item {
	 private Produto produto;	 
	 private Insumo insumo;
	 private Double quantidadeProduto;
	 private Double quantidadeInsumo;
	 
	 
	public Item(Produto produto, Insumo insumo,Double quantidadeReceita, Double quantidadeInsumo) {
		this.produto = produto;
		this.insumo = insumo;
		this.quantidadeProduto = quantidadeProduto;
		this.quantidadeInsumo = quantidadeInsumo;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Insumo getInsumo() {
		return insumo;
	}


	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}


	public Double getQuantidadeProduto() {
		return quantidadeProduto;
	}


	public void setQuantidadeProduto(Double quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}


	public Double getQuantidadeInsumo() {
		return quantidadeInsumo;
	}


	public void setQuantidadeInsumo(Double quantidadeInsumo) {
		this.quantidadeInsumo = quantidadeInsumo;
	}
	
}