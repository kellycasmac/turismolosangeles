package co.com.turismolosangeles.turismolosangeles.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("tour")
public class Tour {
    public Tour(Object object, String string, String string2, double d) {
    }
    public Tour() {
    }
    @Id
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
}
