package br.com.crud.DAO;

import java.sql.SQLException;
import java.util.List;

import br.com.crud.model.Cliente;

public interface InterfaceClienteDAO {
	//so tem as assinaturas dos metodos
	
	public void cadastrar(Cliente cliente) throws ClassNotFoundException, SQLException;//ass de metodo
	public void alterar(Cliente cliente) throws ClassNotFoundException, SQLException;
	public void excluir(String cod)throws ClassNotFoundException, SQLException;
	public List<Cliente>listar()throws ClassNotFoundException, SQLException;
	

}
