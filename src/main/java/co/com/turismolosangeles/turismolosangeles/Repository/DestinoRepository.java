package co.com.turismolosangeles.turismolosangeles.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.com.turismolosangeles.turismolosangeles.model.Destino;

public interface DestinoRepository extends ReactiveCrudRepository<Destino, Long> {
}