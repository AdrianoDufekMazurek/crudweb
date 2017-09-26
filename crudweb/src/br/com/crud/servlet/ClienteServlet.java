package br.com.crud.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crud.model.Cliente;
import br.com.crud.service.ClienteService;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Integer.parseInt(id);
		ClienteService service = new ClienteService();
		service.excluir(id);
        request.setAttribute("lista_clientes", new ClienteService().listar());//joga na memoria posso acessar de qualquer lugar
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrocliente.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		new ClienteService().cadastrar(new Cliente(null,request.getParameter("nome"),request.getParameter("cpf"),request.getParameter("data"),
				request.getParameter("rua"), request.getParameter("numero"), request.getParameter("bairro"),request.getParameter("cidade")
				,request.getParameter("estados"), request.getParameter("telefone"), request.getParameter("celular"),request.getParameter("email")));
		//Alterar
		
		
	
		
		//listar
		request.setAttribute("lista_clientes", new ClienteService().listar());//joga na memoria posso acessar de qualquer lugar
		
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrocliente.jsp");
		//rd.forward(request, response);
		
		//Excluir
	
		String id = request.getParameter("id");
		//Integer.parseInt(id);
		ClienteService service = new ClienteService();
		service.excluir(id);
        request.setAttribute("lista_clientes", new ClienteService().listar());//joga na memoria posso acessar de qualquer lugar
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrocliente.jsp");
		rd.forward(request, response);
		
	}

}
