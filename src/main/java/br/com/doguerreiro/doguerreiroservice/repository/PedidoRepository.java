package br.com.doguerreiro.doguerreiroservice.repository;

import br.com.doguerreiro.doguerreiroservice.entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}
