package br.com.senior.app.pedidos.pedidos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.senior.app.pedidos.pedidos.entities.Pedidos;
import br.com.senior.app.pedidos.pedidos.projections.PedidosProjection;

public interface PedidosRepository extends JpaRepository<Pedidos, Long>
{
	@Query(nativeQuery = true, value = """
			SELECT p.pedido,p.item,p.quantidade 
			  FROM Pedidos p
			 WHERE p.pedido = :pedido
				""")
	List<PedidosProjection> searchByList(Long pedido);
}