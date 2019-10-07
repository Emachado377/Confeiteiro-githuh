package apresentacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

import modelos.Pedido;

public class PedidoApresentacao {

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public void adicionaPedido(Pedido pedido) throws Exception, ParseException {

		double qtdProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto:"));
		Date dataEntrega = formato.parse(JOptionPane.showInputDialog(null, "Informe a dade de entrega: (dd/MM/AAAA)",
				" Date", JOptionPane.PLAIN_MESSAGE));
		pedido.setQuantidadeProduto(qtdProduto);
		pedido.setDataDeEntrega(dataEntrega);
	}

	public void listaPedido(String listaPedido) {
		JOptionPane.showMessageDialog(null, listaPedido, "Lista de Pedidos", JOptionPane.INFORMATION_MESSAGE);
	}
}
