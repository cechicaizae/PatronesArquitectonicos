/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTransferObject;

import java.io.Serializable;

/**
 *
 * @author ce.christian
 */
class Persona implements Serializable {
    private static final long serialversionUID = 1L;
    private Integer codigo;
    private String nombre;
    private Long salario;
    
    public Integer getCodigo() {
    return codigo;
    }

    public void setCodigo(Integer codigo) {
    this.codigo = codigo;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }
    
    public String getnombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;

}
}

