package br.com.crud.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.openmbean.OpenDataException;

import br.com.crud.model.Cliente;
import br.com.crud.util.ConexaoUtil;

public class ClienteDao implements InterfaceClienteDAO{

	private Connection com;//recebe conec
	private PreparedStatement statement;//recebe os atributos do paramentro
	private ResultSet rs;//Utilizado para listar no banco de daods
	private String sql;//comando sql
	
	@Override
	public void cadastrar(Cliente cliente) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
				
		//preparando a conecção
		com = ConexaoUtil.getInstance().getConnection();
		//prepara o comando sql
		sql="INSERT INTO TB_CLIENTE(NOME,CPF, DATA_CADASTRO,RUA,NUMERO,BAIRRO,CIDADE,ESTADO,TELEFONE,CELULAR,EMAIL)values(?,?,?,?,?,?,?,?,?,?,?)";
		//sattemant recebe a conexao
		statement = com.prepareStatement(sql);
		//setando as dados no banco
		statement.setString(1,cliente.getNome() );
		statement.setString(2, cliente.getCpf());
		statement.setString(3, cliente.getData());
		statement.setString(4, cliente.getRua());
		statement.setString(5, cliente.getNumero());
		statement.setString(6, cliente.getBairro());
		statement.setString(7, cliente.getCidade());
		statement.setString(8, cliente.getEstado());
		statement.setString(9, cliente.getTelefone());
		statement.setString(10, cliente.getCelular());
		statement.setString(11, cliente.getEmail());
	
		statement.execute();//executat tudo o statements
		
		com.close();
		statement.close();
	}

	@Override
	public void alterar(Cliente cliente) throws ClassNotFoundException, SQLException {
		com = ConexaoUtil.getInstance().getConnection();
		//preparar o comando sql
		sql="UPDATE TB_CLIENTE SET NOME=?,CPF=?, DATA_CADASTRO=?,RUA=?,NUMERO=?,BAIRRO=?,CIDADE=?,ESTADO=?,TELEFONE=?,CELULAR=?,EMAIL=?;";
		//statemant recebe a conexao junto com sql
		statement = com.prepareStatement(sql);
		//seta os dados no banco
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getCpf());
		statement.setString(3, cliente.getData());
		statement.setString(4, cliente.getRua());
		statement.setString(5, cliente.getNumero());
		statement.setString(6, cliente.getBairro());
		statement.setString(7, cliente.getCidade());
		statement.setString(8, cliente.getEstado());
		statement.setString(9, cliente.getTelefone());
		statement.setString(10, cliente.getCelular());
		statement.setString(11, cliente.getEmail());
		
		statement.execute();
		
		com.close();
		statement.close();
	}

	@Override
	public void excluir(String cod) throws ClassNotFoundException, SQLException {
		//int codigo =Integer.parseInt(cod);
		//preparando a conecção
		com = ConexaoUtil.getInstance().getConnection();
		//prepara o comando sql
		sql="DELETE FROM TB_CLIENTE WHERE id=?;";
		
		statement = com.prepareStatement(sql);
		statement.setString(1, cod);
		statement.execute();
		com.close();
		statement.close();
		
	}

	@Override
	public List<Cliente> listar() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Cliente> lista_cliente= new ArrayList<>();
		
		com=ConexaoUtil.getInstance().getConnection();
		
		sql = "SELECT * FROM TB_CLIENTE";
		statement = com.prepareStatement(sql);
		
		//para listar
		rs = statement.executeQuery();
		
		if(rs != null){
			while(rs.next()){ //rs.next
				lista_cliente.add(new Cliente(rs.getInt("id"), rs.getString("nome"),rs.getString("cpf"), rs.getString("DATA_CADASTRO"), rs.getString("rua"), rs.getString("numero"), 
						rs.getString("bairro"), rs.getString("cidade"), rs.getString("estado"), rs.getString("telefone"), rs.getString("celular"),rs.getString("email")));
			}
		}
		
		return lista_cliente;
	}

	
	
	

}
