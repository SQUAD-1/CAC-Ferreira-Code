package Objetos;

import java.util.List;
import java.util.ArrayList;

public class Pedidos {
	
	private static int n_pedido;
	private String notaFiscal;
	private String transportadora;
	private String canalVenda;
	private String Unidade;
	private List<Produto> listaProdutos = new ArrayList<>();
	
	public static int getN_pedido() {
		return n_pedido;
	}
	public static void setN_pedido(int n_pedido) {
		Pedidos.n_pedido = n_pedido;
	}
	public String getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}
	public String getCanalVenda() {
		return canalVenda;
	}
	public void setCanalVenda(String canalVenda) {
		this.canalVenda = canalVenda;
	}
	public String getUnidade() {
		return Unidade;
	}
	public void setUnidade(String unidade) {
		Unidade = unidade;
	}
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
