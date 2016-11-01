package sistema.mb;

import java.util.ArrayList;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.dao.ClienteDAO;
import sistema.entidades.Cliente;
import sistema.entidades.Pedido;

@ManagedBean(name="mbCliente")
@SessionScoped
public class ClienteManagedBean {
	
	private ClienteDAO clienteDAO = new ClienteDAO();
    private Cliente novoCliente = new Cliente();
    private Pedido  novoPedido;
    private Cliente clienteAtual;
	
	
	public String salvar()
	{
		clienteDAO.salvar(novoCliente);
		novoCliente = new Cliente();
		return "menu";
	}
	
	
	public ArrayList <Cliente> getClientes()
	{
		return clienteDAO.getClientes();
	}
	
	public void addPedido()
	{
		clienteAtual.addPedido(novoPedido);
		novoPedido.setCliente(clienteAtual);
		novoPedido = new Pedido();
    }

	public String verPedidos(String codigo)
	{
		clienteAtual = clienteDAO.getClienteById(Integer.parseInt(codigo));
		return "listarPedidosCliente";
	}
	
	public String novoPedido()
	{
		novoPedido = new Pedido();
		return "cadastroPedido";
		
	}
	
	
	public String salvarPedido()
	{
		clienteAtual.addPedido(novoPedido);
		novoPedido.setCliente(clienteAtual);
		return "listarPedidosCliente";
		
	}
	

	public Cliente getNovoCliente() {
		return novoCliente;
	}


	public void setNovoCliente(Cliente novoCliente) {
		this.novoCliente = novoCliente;
	}


	public Pedido getNovoPedido() {
		return novoPedido;
	}


	public void setNovoPedido(Pedido novoPedido) {
		this.novoPedido = novoPedido;
	}


	public Cliente getClienteAtual() {
		return clienteAtual;
	}


	public void setClienteAtual(Cliente clienteAtual) {
		this.clienteAtual = clienteAtual;
	}
	
	

}
