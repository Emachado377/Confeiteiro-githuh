package modelos;

import modelos.Insumo;
import modelos.Produto;

public class Componente {
	private Produto produto;
	private Insumo insumo;
	private Double quantidadeInsumo;
	private String unidadeMedidaInsumo;
	
	public Componente(Produto produto, Insumo insumo,  Double quantidadeInsumo, String unidadeMedidaInsumo) {
		this.produto = produto;
		this.insumo = insumo;
		this.quantidadeInsumo = quantidadeInsumo;
		this.unidadeMedidaInsumo = unidadeMedidaInsumo;
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
	
	public String getUnidadeMedidaInsumo() {
		return unidadeMedidaInsumo;
	}

	public void setUnidadeMedidaInsumo(String unidadeMedidaInsumo) {
		this.unidadeMedidaInsumo = unidadeMedidaInsumo;
	}

}