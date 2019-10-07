package modelos;

import java.util.Date;

public class Pedido {
	private Cliente cliente;
	private Produto produto;
	private Double quantidadeProduto;
	private Date dataDeEntrega;

	public Pedido(Cliente cliente, Produto produto, Double quantidadeProduto) {
		this.cliente = cliente;
		this.produto = produto;
		this.quantidadeProduto = quantidadeProduto;
	}

	public Pedido() {
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(Double quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Date getDataDeEntrega() {
		return dataDeEntrega;
	}

	public void setDataDeEntrega(Date dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}
}
