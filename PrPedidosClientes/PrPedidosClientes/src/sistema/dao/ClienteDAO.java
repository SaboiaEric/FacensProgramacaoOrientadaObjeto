package sistema.dao;

import java.util.ArrayList;

import sistema.entidades.Cliente;

public class ClienteDAO {
	
	public ArrayList <Cliente> clientes = new ArrayList <Cliente>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void salvar(Cliente cliente )
	{
		clientes.add(cliente);
	}

	public Cliente getClienteById(int idCliente) {
		
		for(int i=0; i< clientes.size(); i++)
			if(idCliente == clientes.get(i).getCodigo())
				return clientes.get(i);
		
		return null;
	}
	

}
