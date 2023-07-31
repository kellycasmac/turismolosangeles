package co.com.turismolosangeles.turismolosangeles.Service;

import co.com.turismolosangeles.turismolosangeles.model.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UsuarioService {
    Flux<Usuario> getAllUsuarios();

    Mono<Usuario> getUsuarioById(Long id);
}