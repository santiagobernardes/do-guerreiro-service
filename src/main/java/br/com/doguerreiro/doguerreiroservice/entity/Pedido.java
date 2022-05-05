package br.com.doguerreiro.doguerreiroservice.entity;

import br.com.doguerreiro.doguerreiroservice.enums.FormaPagamentoEnum;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Pedido {
    @Id
    private Integer id;
    private Double valor;
    private LocalDateTime dataHora;
    private FormaPagamentoEnum formaPagamento;
    private Cliente ciente;
    private List<Item> itens;
}
