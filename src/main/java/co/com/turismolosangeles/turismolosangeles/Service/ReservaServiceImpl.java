package co.com.turismolosangeles.turismolosangeles.Service;

import org.springframework.stereotype.Service;

import co.com.turismolosangeles.turismolosangeles.Repository.ReservaRepository;
import co.com.turismolosangeles.turismolosangeles.model.Reserva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaServiceImpl(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    @Override
    public Flux<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public Mono<Reserva> getReservaById(Long id) {
        return reservaRepository.findById(id);
    }

    @Override
    public Mono<Reserva> createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Mono<Reserva> updateReserva(Long id, Reserva reserva) {
        return reservaRepository.findById(id)
                .flatMap(existingReserva -> {
                    existingReserva.setTourId(reserva.getTourId());
                    existingReserva.setFechaReserva(reserva.getFechaReserva());
                    existingReserva.setCantidadPersonas(reserva.getCantidadPersonas());
                    return reservaRepository.save(existingReserva);
                });
    }

    @Override
    public Mono<Void> deleteReserva(Long id) {
        return reservaRepository.deleteById(id);
    }
}