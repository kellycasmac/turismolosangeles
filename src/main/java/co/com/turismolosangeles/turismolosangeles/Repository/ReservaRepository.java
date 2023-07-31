package co.com.turismolosangeles.turismolosangeles.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.com.turismolosangeles.turismolosangeles.model.Reserva;

public interface ReservaRepository extends ReactiveCrudRepository<Reserva, Long> {
}
