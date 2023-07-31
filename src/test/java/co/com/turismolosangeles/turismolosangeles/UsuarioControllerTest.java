package co.com.turismolosangeles.turismolosangeles;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.com.turismolosangeles.turismolosangeles.Controller.UsuarioController;
import co.com.turismolosangeles.turismolosangeles.Service.UsuarioService;
import co.com.turismolosangeles.turismolosangeles.model.Usuario;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class UsuarioControllerTest {

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioController usuarioController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllUsuarios() {
        when(usuarioService.getAllUsuarios()).thenReturn(Flux.just(new Usuario(), new Usuario()));
        usuarioController.getAllUsuarios();
        verify(usuarioService, times(1)).getAllUsuarios();
    }

    @Test
    public void testGetUsuarioById() {
        Long usuarioId = 1L;
        Usuario usuario = new Usuario();
        usuario.setId(usuarioId);
        when(usuarioService.getUsuarioById(usuarioId)).thenReturn(Mono.just(usuario));
        usuarioController.getUsuarioById(usuarioId);
        verify(usuarioService, times(1)).getUsuarioById(usuarioId);
    }
}