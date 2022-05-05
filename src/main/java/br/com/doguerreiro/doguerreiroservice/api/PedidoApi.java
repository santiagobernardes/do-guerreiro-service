package br.com.doguerreiro.doguerreiroservice.api;

import br.com.doguerreiro.doguerreiroservice.api.request.PedidoRequest;
import br.com.doguerreiro.doguerreiroservice.api.response.PedidoResponse;
import br.com.doguerreiro.doguerreiroservice.entity.Pedido;
import br.com.doguerreiro.doguerreiroservice.mapper.PedidoMapper;
import br.com.doguerreiro.doguerreiroservice.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@AllArgsConstructor
public class PedidoApi {

    private PedidoService pedidoService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Integer salvar(@RequestBody PedidoRequest pedidoRequest) {
        Pedido pedido = PedidoMapper.map(pedidoRequest);
        return pedidoService.salvar(pedido);
    }

    @GetMapping("/{id}")
    public PedidoResponse buscar(@PathVariable Integer id) {
        return pedidoService.buscar(id);
    }

    @GetMapping()
    public List<PedidoResponse> buscar() {
        return pedidoService.buscar());
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void editar(@RequestBody PedidoRequest pedidoRequest, @PathVariable Integer id) {
        Pedido pedido = PedidoMapper.map(pedidoRequest);
        pedidoService.editar(pedido, id);
    }

    @PutMapping("/{id}/cancelamento")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void cancelar(Integer id) {
        pedidoService.cancelar(id);
    }
}
