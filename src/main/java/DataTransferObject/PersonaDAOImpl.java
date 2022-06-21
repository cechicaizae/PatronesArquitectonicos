/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTransferObject;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ce.christian
 */

public class PersonaDAOImpl implements PersonaDAO{

    /**
     *
     * @return
     */
    @Override
	public List<Persona> listarTodos() {
		List<Persona> lista = new ArrayList<>();
		Persona per = new Persona();
		per.setId(1);
		per.setNombres("Mito");
		
		lista.add(per);
		
		per = new Persona();
		per.setId(2);
		per.setNombres("Code");
		
		lista.add(per);
		
		return lista;
	}

	@Override
	public Persona leerPorId(int id) {
		//logica
		return null;
	}
	
	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " registrada");
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona " + persona.getNombres() + " actualizada");
	}

	@Override
	public void eliminar(int id) {
		System.out.println("id " + id + "eliminado");
	}

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		
	}

}
