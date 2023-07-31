package co.com.turismolosangeles.turismolosangeles.Service;

import org.springframework.stereotype.Service;

import co.com.turismolosangeles.turismolosangeles.Repository.DestinoRepository;
import co.com.turismolosangeles.turismolosangeles.model.Destino;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DestinoServiceImpl implements DestinoService {

    private final DestinoRepository destinoRepository;

    public DestinoServiceImpl(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }

    @Override
    public Flux<Destino> getAllDestinos() {
        return destinoRepository.findAll();
    }

    @Override
    public Mono<Destino> getDestinoById(Long id) {
        return destinoRepository.findById(id);
    }
}
