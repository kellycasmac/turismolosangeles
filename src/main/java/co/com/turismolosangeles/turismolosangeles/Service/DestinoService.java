package co.com.turismolosangeles.turismolosangeles.Service;

import co.com.turismolosangeles.turismolosangeles.model.Destino;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DestinoService {
    Flux<Destino> getAllDestinos();

    Mono<Destino> getDestinoById(Long id);
}