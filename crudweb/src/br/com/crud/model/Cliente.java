package br.com.crud.model;

public class Cliente {
	private Integer id;//esse Long e uma classe
	private String nome;
	private String cpf;
	private String data;
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String telefone;
	private String celular;
	private String email;
	
	public Cliente(){
		
	}
	//source > construs user fild
	public Cliente(Integer id,String nome, String cpf, String data, String rua, String numero, String bairro, String cidade,
			String estado, String telefone, String celular, String email) {
		//esse é um construtor qualificado pq possui todos os atributos da classe
		this.id =id;
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id= id;
	}
	
	
	
	
	
	

}
