package controles;

import java.util.ArrayList;

import apresentacoes.ClienteApresentacao;
import modelos.Cliente;

public class ClienteControle {

	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	ClienteApresentacao clienteApresentacao = new ClienteApresentacao();

	public void adicionaCliente() {
		Cliente cliente = new Cliente();
		clienteApresentacao.adicionaCliente(cliente);
		listaClientes.add(cliente);
	}

	public void listaCliente() {
		String listaClienteTemporaria = "";
		int n = listaClientes.size();
		for (int i = 0; i < n; i++) {
			listaClienteTemporaria += Integer.toString(i) + " - " + listaClientes.get(i).getNome() + "\nTelfone: "
					+ listaClientes.get(i).getTelefone() + "\n";
		}

		clienteApresentacao.listaCliente(listaClienteTemporaria);
	}

	public Cliente selecionaCliente() {
		String listaNomeClienteTemporaria = "";
		int n = listaClientes.size();
		for (int i = 0; i < n; i++) {
			listaNomeClienteTemporaria += Integer.toString(i) + " - " + listaClientes.get(i).getNome() + "\n";
		}
		int idCliente = clienteApresentacao.selecionaCliente(listaNomeClienteTemporaria);
		return listaClientes.get(idCliente);
	}

	public void populaCliente(String nome, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		listaClientes.add(cliente);
	}

	public Cliente obtemClienteParaPopular(int idCliente) {
		return listaClientes.get(idCliente);
	}
}
