package controles;

import java.util.ArrayList;

import apresentacoes.ClienteApresentacao;
import modelos.Cliente;
import modelos.Produto;


public class ClienteControle {
	private ArrayList <Cliente> listaClientes = new ArrayList<Cliente>();
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
			listaClienteTemporaria += Integer.toString(i) 
					+ " - " + listaClientes.get(i).getNome() 
					+ "\nTelfone: " + listaClientes.get(i).getTelefone() + "\n";
		}

		clienteApresentacao.listaCliente(listaClienteTemporaria); 
	}
	public void populaCliente(String nome, String telefone) {
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		listaClientes.add(cliente);
	}
}
