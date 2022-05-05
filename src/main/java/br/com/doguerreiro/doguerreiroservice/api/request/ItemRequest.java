package br.com.doguerreiro.doguerreiroservice.api.request;

import br.com.doguerreiro.doguerreiroservice.enums.SaborEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequest {
    private Integer quantidade;
    private SaborEnum sabor;
}
