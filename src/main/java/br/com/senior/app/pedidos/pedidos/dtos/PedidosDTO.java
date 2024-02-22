package br.com.senior.app.pedidos.pedidos.dtos;

import org.springframework.beans.BeanUtils;

import br.com.senior.app.pedidos.pedidos.entities.Pedidos;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PedidosDTO 
{
	private Long id;
	private Long pedido;
	private String item;
	private Long quantidade;
	
	public PedidosDTO(Pedidos entity) 
	{
		BeanUtils.copyProperties(entity, this);
	}
}