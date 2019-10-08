package controles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import apresentacoes.PedidoApresentacao;
import modelos.Cliente;
import modelos.Pedido;
import modelos.Produto;

public class PedidoControle {

	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	PedidoApresentacao pedidoApresentacao = new PedidoApresentacao();

	public void adicionaPedido(Cliente cliente, Produto produto) throws Exception {
		Pedido pedido = new Pedido();
		pedidoApresentacao.adicionaPedido(pedido);
		pedido.setCliente(cliente);
		pedido.setProduto(produto);
		listaPedidos.add(pedido);
	}

	public void listaPedido() {
		String listaPedidoTemporaria = "";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		int n = listaPedidos.size();
		for (int i = 0; i < n; i++) {
			listaPedidoTemporaria += Integer.toString(i) + " Cliente: " + listaPedidos.get(i).getCliente().getNome()
					+ "\n" + " Produto: " + listaPedidos.get(i).getProduto().getNome() + " \n " + " Quantidade: "
					+ listaPedidos.get(i).getQuantidadeProduto() + " " + listaPedidos.get(i).getProduto().getUnidade() + "\n"  + " Data de Entrega: "
					+ formato.format(listaPedidos.get(i).getDataDeEntrega()) + "\n ------------------------\n";

		}
		pedidoApresentacao.listaPedido(listaPedidoTemporaria);
	}

	public void populaPedido(Cliente cliente, Produto produto, double qtdProduto, String dataEntrega)
			throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setProduto(produto);
		pedido.setQuantidadeProduto(qtdProduto);
		Date entregaData = formato.parse(dataEntrega);
		pedido.setDataDeEntrega(entregaData);
		listaPedidos.add(pedido);
	}
}
