package br.com.senior.app.pedidos.pedidos.projections;

public interface PedidosProjection 
{
	Long   getPedido();
	String getItem();
	Long   getQuantidade();
}