package modelos;

import modelos.Insumo;
import modelos.Produto;

public class Componente {
	private Produto produto;
	private Insumo insumo;
	private Double quantidadeInsumo;
	
	public Componente(Produto produto, Insumo insumo,  Double quantidadeInsumo) {
		this.produto = produto;
		this.insumo = insumo;
		this.quantidadeInsumo = quantidadeInsumo;
		
	}

	public Componente() {
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

	public Double getQuantidadeInsumo() {
		return quantidadeInsumo;
	}

	public void setQuantidadeInsumo(Double quantidadeInsumo) {
		this.quantidadeInsumo = quantidadeInsumo;
	}

}