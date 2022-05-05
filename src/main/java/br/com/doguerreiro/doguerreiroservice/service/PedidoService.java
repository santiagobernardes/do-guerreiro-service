package br.com.doguerreiro.doguerreiroservice.service;

import br.com.doguerreiro.doguerreiroservice.api.request.PedidoRequest;
import br.com.doguerreiro.doguerreiroservice.api.response.PedidoResponse;
import br.com.doguerreiro.doguerreiroservice.entity.Pedido;
import br.com.doguerreiro.doguerreiroservice.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public Integer salvar(Pedido pedido) {
        Pedido save = pedidoRepository.save(pedido);
        return save.getId();
    }

    public PedidoResponse buscar(Integer id) {
        return null;
    }

    public void editar(Pedido pedido, Integer id) {

    }

    public void cancelar(Integer id) {

    }
}
