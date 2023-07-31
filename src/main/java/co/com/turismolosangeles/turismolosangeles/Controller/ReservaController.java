package co.com.turismolosangeles.turismolosangeles.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.turismolosangeles.turismolosangeles.Service.ReservaService;
import co.com.turismolosangeles.turismolosangeles.model.Reserva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public Flux<Reserva> getAllReservas() {
        return reservaService.getAllReservas();
    }

    @GetMapping("/{id}")
    public Mono<Reserva> getReservaById(@PathVariable Long id) {
        return reservaService.getReservaById(id);
    }

    @PostMapping
    public Mono<Reserva> createReserva(@RequestBody Reserva reserva) {
        return reservaService.createReserva(reserva);
    }

    @PutMapping("/{id}")
    public Mono<Reserva> updateReserva(@PathVariable Long id, @RequestBody Reserva reserva) {
        return reservaService.updateReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteReserva(@PathVariable Long id) {
        return reservaService.deleteReserva(id);
    }
}