package br.com.doguerreiro.doguerreiroservice.mapper;

import br.com.doguerreiro.doguerreiroservice.api.request.PedidoRequest;
import br.com.doguerreiro.doguerreiroservice.entity.Cliente;
import br.com.doguerreiro.doguerreiroservice.entity.Pedido;

import java.time.LocalDateTime;

public class PedidoMapper {
    public static Pedido map(PedidoRequest pedidoRequest) {
        return Pedido.builder()
                .ciente(Cliente.builder()
                        .id(pedidoRequest.getIdCliente())
                        .build())
                .dataHora(LocalDateTime.now())
                .formaPagamento(pedidoRequest.getFormaPagamento())
                .itens(ItemMapper.map(pedidoRequest.getItens()))
                .valor(pedidoRequest.getValor())
                .build();
    }
}
