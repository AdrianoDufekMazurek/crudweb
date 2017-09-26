package br.com.crud.service;

import java.sql.SQLException;
import java.util.List;

import br.com.crud.DAO.ClienteDao;
import br.com.crud.DAO.FactoryDao;
import br.com.crud.model.Cliente;

public class ClienteService {
	
	public void cadastrar(Cliente cliente){//smp dos metodos da DAO e das demais
		if(!cliente.getNome().isEmpty()){//isEmpty(vazio)
			try {
				FactoryDao.createClienteDao().cadastrar(cliente);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	public List<Cliente> listar(){
		try {
			return FactoryDao.createClienteDao().listar();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void excluir(String codigo){
		try {
			FactoryDao.createClienteDao().excluir(codigo);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void alterar(Cliente cliente) throws ClassNotFoundException, SQLException{
		FactoryDao.createClienteDao().alterar(cliente);
	}


		
}
