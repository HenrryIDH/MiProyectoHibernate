package edu.educacionit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    public String id;
    public String nombre;
    public String apellido;
    public String domicilio;
    public String pais;

    @Column(name = "tipo_de_usuario")
    public TipoDeUsuario tipoDeUsuario;

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", pais='" + pais + '\'' +
                ", tipoDeUsuario=" + tipoDeUsuario +
                '}';
    }
}
