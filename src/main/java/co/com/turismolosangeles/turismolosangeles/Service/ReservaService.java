package co.com.turismolosangeles.turismolosangeles.Service;

import co.com.turismolosangeles.turismolosangeles.model.Reserva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReservaService {
    Flux<Reserva> getAllReservas();

    Mono<Reserva> getReservaById(Long id);

    Mono<Reserva> createReserva(Reserva reserva);

    Mono<Reserva> updateReserva(Long id, Reserva reserva);

    Mono<Void> deleteReserva(Long id);
}