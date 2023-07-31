package co.com.turismolosangeles.turismolosangeles.Service;

import org.springframework.stereotype.Service;

import co.com.turismolosangeles.turismolosangeles.Repository.UsuarioRepository;
import co.com.turismolosangeles.turismolosangeles.model.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Flux<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Mono<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }
}