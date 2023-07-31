package co.com.turismolosangeles.turismolosangeles.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("destino")
public class Destino {
    public Destino(Object object, String string, String string2) {
    }
    public Destino() {
    }
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
}
