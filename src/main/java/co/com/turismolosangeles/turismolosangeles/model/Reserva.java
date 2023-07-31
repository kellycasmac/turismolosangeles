package co.com.turismolosangeles.turismolosangeles.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("reserva")
public class Reserva {
    public Reserva(Object object, long l, LocalDateTime now, Integer i) {
    }
    public Reserva() {
    }
    @Id
    private Long id;
    private Long tourId;
    private LocalDateTime fechaReserva;
    private Integer cantidadPersonas;
}
