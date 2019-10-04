package apresentacoes;

import javax.swing.JOptionPane;

import modelos.Cliente;

public class ClienteApresentacao {
	
	public void adicionaCliente(Cliente cliente) {
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do Cliente:"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone para contato:"));
		
	}
	
	public void listaCliente(String listaClientes){
		JOptionPane.showMessageDialog(null, "Lista de Clientes Cadastrados" + "\n\n" + listaClientes);
	}	
}
