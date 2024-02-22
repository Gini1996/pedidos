package br.com.senior.app.pedidos.pedidos.dtos;

import br.com.senior.app.pedidos.pedidos.projections.PedidosProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PedidosByListDTO 
{
	private Long pedido;
	private String item;
	private Long quantidade;
	
	public PedidosByListDTO(PedidosProjection projection)
	{
		pedido = projection.getPedido();
		item = projection.getItem();
		quantidade = projection.getQuantidade();
	}
}
