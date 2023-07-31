package co.com.turismolosangeles.turismolosangeles.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("usuario")
public class Usuario {
    public Usuario(Object object, String string, String string2) {
    }
    public Usuario() {
    }
    @Id
    private Long id;
    private String nombre;
    private String correo;
}