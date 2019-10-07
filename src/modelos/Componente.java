package modelos;

import modelos.Insumo;
import modelos.Produto;

public class Componente {
	private Produto produto;
	private Insumo insumo;
	private Double quantidadeProduto;
	private Double quantidadeInsumo;
	private String descricaoPreparo;

	public Componente(Produto produto, Insumo insumo, Double quantidadeProduto, Double quantidadeInsumo,
			String descricaoPreparo) {
		this.produto = produto;
		this.insumo = insumo;
		this.quantidadeProduto = quantidadeProduto;
		this.quantidadeInsumo = quantidadeInsumo;
		this.descricaoPreparo = descricaoPreparo;
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

	public String getDescricaoPreparo() {
		return descricaoPreparo;
	}

	public void setDescricaoPreparo(String descricaoPreparo) {
		this.descricaoPreparo = descricaoPreparo;
	}
}