package co.com.turismolosangeles.turismolosangeles;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.com.turismolosangeles.turismolosangeles.Controller.ReservaController;
import co.com.turismolosangeles.turismolosangeles.Service.ReservaService;
import co.com.turismolosangeles.turismolosangeles.model.Reserva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReservaControllerTest {

    @Mock
    private ReservaService reservaService;

    @InjectMocks
    private ReservaController reservaController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllReservas() {
        when(reservaService.getAllReservas()).thenReturn(Flux.just(new Reserva(), new Reserva()));
        reservaController.getAllReservas();
        verify(reservaService, times(1)).getAllReservas();
    }

    @Test
    public void testGetReservaById() {
        Long reservaId = 1L;
        Reserva reserva = new Reserva();
        reserva.setId(reservaId);
        when(reservaService.getReservaById(reservaId)).thenReturn(Mono.just(reserva));
        reservaController.getReservaById(reservaId);
        verify(reservaService, times(1)).getReservaById(reservaId);
    }

    @Test
    public void testCreateReserva() {
        Reserva reserva = new Reserva();
        when(reservaService.createReserva(reserva)).thenReturn(Mono.just(reserva));
        reservaController.createReserva(reserva);
        verify(reservaService, times(1)).createReserva(reserva);
    }

    @Test
    public void testUpdateReserva() {
        Long reservaId = 1L;
        Reserva reserva = new Reserva();
        reserva.setId(reservaId);
        when(reservaService.updateReserva(reservaId, reserva)).thenReturn(Mono.just(reserva));
        reservaController.updateReserva(reservaId, reserva);
        verify(reservaService, times(1)).updateReserva(reservaId, reserva);
    }

    @Test
    public void testDeleteReserva() {
        Long reservaId = 1L;
        when(reservaService.deleteReserva(reservaId)).thenReturn(Mono.empty());
        reservaController.deleteReserva(reservaId);
        verify(reservaService, times(1)).deleteReserva(reservaId);
    }
}