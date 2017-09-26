<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Auterar Cliente</title>
<style>
table {border:solid 2px #000; padding:5px;box-shadow:1px 1px 4px black;}
td {color:#099;}
button{background-color:#999}
</style>
</head>
<body>
	<h1>Cadastrar Cliente</h1>
		<form action="ClienteServlet" method="post">
		<table>
			<tr>
				<td><b>Nome</b></td>
				<td><input type="text" name="nome" id="nome" value""/></td>
				<td><b>CPF</b></td>
				<td><input type="text" name="cpf" id="cpf" value=""/></td>
				<td><b>Data</b></td>
				<td><input type="text" name="data" id="data" value=""/></td>
			</tr>
			<tr>
				<td><b>Endereço</b></td>
			</tr>
			<tr>
				<td><b>Rua</</b></td>
				<td><input type="text" name="rua" id="rua" value=""/></td>
				<td><b>Nº</b></td>
				<td><input type="text" name="numero" id="numero" value=""/></td>
			</tr>
			<tr>
				<td><b>Bairro</</b></td>
				<td><input type="text" name="bairro" id="bairro" value=""/></td>
				<td><b>Cidade</b></td>
				<td><input type="text" name="cidade" id="cidade" value=""/></td>
				<td><b>Uf</b></td>
				<td> 
					<select name="estados" id="estados">
						<option value="ac">AC</option>
						<option value="ac">AL</option>
						<option value="ac">AP</option>
						<option value="ac">AM</option>
						<option value="ac">BA</option>
						<option value="ac">CE</option>
						<option value="ac">DF</option>
						<option value="ac">ES</option>
						<option value="ac">GO</option>
						<option value="ac">MA</option>
						<option value="ac">MT</option>
						<option value="ac">MS</option>
						<option value="ac">PR</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><b>Telefone</</b></td>
				<td><input type="text" name="telefone" id="telefone" value=""/></td>
				<td><b>Celular</b></td>
				<td><input type="text" name="celular" id="celular" value=""/></td>
			</tr>
			<tr>
				<td><b>Email</</b></td>
				<td><input type="text" name="email" id="email" value=""/></td>
			</tr>
			<tr>
			<br>
			<td><input type="submit" value="Salvar" /></td>
			
			</tr>
			
		</table>		
		</form>
		<p>
		<h1>Lista de Clientes</h1>
		<table>
		<c:choose>
				<c:when test="${not empty lista_clientes}">
					<tr>
						<td>ID</td>
						<td>NOME</td>
						<td>CPF</td>
						<td>E-MAIL</td>
						<td>TELEFONE</td>
					</tr>
					<c:forEach var="cliente" items="${lista_clientes}">
						<tr>
							<td>${cliente.id} </td>
							<td>${cliente.nome}</td>
							<td>${cliente.cpf}</td>
							<td>${cliente.email}</td>
							<td>${cliente.telefone}</td>
							<td>
								<a href="/crudweb/ClienteServlet?id=${cliente.id}">Excluir</a>
							</td>
							<td>
								<a href="/crudweb/ClienteServlet?id=${cliente.id}">Alterar</a>
							</td>
						</tr>
					</c:forEach>
					
					
				</c:when>
				<c:otherwise>
					<tr>Não existe registros</tr>
				</c:otherwise>
			</c:choose>
		</table>
</body>
</html>