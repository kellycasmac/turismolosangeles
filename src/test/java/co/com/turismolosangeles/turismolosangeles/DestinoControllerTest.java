package co.com.turismolosangeles.turismolosangeles;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.com.turismolosangeles.turismolosangeles.Controller.DestinoController;
import co.com.turismolosangeles.turismolosangeles.Service.DestinoService;
import co.com.turismolosangeles.turismolosangeles.model.Destino;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DestinoControllerTest {

    @Mock
    private DestinoService destinoService;

    @InjectMocks
    private DestinoController destinoController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllDestinos() {
        when(destinoService.getAllDestinos()).thenReturn(Flux.just(new Destino(), new Destino()));
        destinoController.getAllDestinos();
        verify(destinoService, times(1)).getAllDestinos();
    }

    @Test
    public void testGetDestinoById() {
        Long destinoId = 1L;
        Destino destino = new Destino();
        destino.setId(destinoId);
        when(destinoService.getDestinoById(destinoId)).thenReturn(Mono.just(destino));
        destinoController.getDestinoById(destinoId);
        verify(destinoService, times(1)).getDestinoById(destinoId);
    }
}