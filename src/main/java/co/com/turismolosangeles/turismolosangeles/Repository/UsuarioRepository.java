package co.com.turismolosangeles.turismolosangeles.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.com.turismolosangeles.turismolosangeles.model.Usuario;

public interface UsuarioRepository extends ReactiveCrudRepository<Usuario, Long> {
}