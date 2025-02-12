

package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*; //asterisco para Entity y Table
import java.io.Serializable;

@Data // Generar por debajo los set y get
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; //debe ser camel case, no puede ser cualquier nombre
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria(){
        
    }
    
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
        this.rutaImagen = rutaImagen;
    }
}
