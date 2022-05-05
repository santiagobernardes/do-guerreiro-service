package br.com.doguerreiro.doguerreiroservice.api.request;

import br.com.doguerreiro.doguerreiroservice.enums.FormaPagamentoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PedidoRequest {
    private Double valor;
    private FormaPagamentoEnum formaPagamento;
    private Integer idCliente;
    private List<ItemRequest> itens;
}
