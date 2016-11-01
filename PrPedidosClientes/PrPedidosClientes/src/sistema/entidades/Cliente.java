package sistema.entidades;

import java.util.ArrayList;

public class Cliente {
	private int codigo;
	private String nome;
	private ArrayList <Pedido> pedidos = new ArrayList <Pedido>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	public void addPedido(Pedido pedido)
	{
		
		pedidos.add(pedido);
	}
	

}
