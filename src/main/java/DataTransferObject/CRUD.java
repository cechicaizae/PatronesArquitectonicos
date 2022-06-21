/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTransferObject;
import java.util.List;
/**
 *
 * @author ce.christian
 */


public interface CRUD<T> {

	List<T> listarTodos();
	T leerPorId (int id);
	void registrar(T t);
	void actualizar(T t);
	void eliminar(int id);
}