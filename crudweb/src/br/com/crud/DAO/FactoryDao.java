package br.com.crud.DAO;

public class FactoryDao {
	//facto 
	public static InterfaceClienteDAO createClienteDao(){
		return new ClienteDao();
	}

}
