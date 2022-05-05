package br.com.doguerreiro.doguerreiroservice.entity;

import br.com.doguerreiro.doguerreiroservice.enums.SaborEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private Double valor;
    private SaborEnum sabor;
}
