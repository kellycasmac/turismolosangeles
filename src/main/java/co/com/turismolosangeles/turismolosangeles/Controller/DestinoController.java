package co.com.turismolosangeles.turismolosangeles.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.turismolosangeles.turismolosangeles.Service.DestinoService;
import co.com.turismolosangeles.turismolosangeles.model.Destino;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    private final DestinoService destinoService;

    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public Flux<Destino> getAllDestinos() {
        return destinoService.getAllDestinos();
    }

    @GetMapping("/{id}")
    public Mono<Destino> getDestinoById(@PathVariable Long id) {
        return destinoService.getDestinoById(id);
    }
}