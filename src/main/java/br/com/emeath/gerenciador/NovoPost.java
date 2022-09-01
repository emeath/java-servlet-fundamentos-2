package br.com.emeath.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoPost
 */
@WebServlet("/NovoPost")
public class NovoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tituloPost = request.getParameter("titulo_post");
		String corpoPost = request.getParameter("corpo_post");
		
		System.out.println(tituloPost);
		System.out.println(corpoPost);
		
		PrintWriter output = response.getWriter();
		output.println("<html>");
		
		output.println("<head>");
		output.println("	<title>Post cadastrado!</title>");
		output.println("	<link rel=\"stylesheet\" href=\"styles.css\">");
		output.println("</head>");

		output.println("<body>");
		output.println("<p>Post cadastrado com sucesso!</p>");
		output.println("<br>");
		output.println("<hr>");
		output.println("</body>");
		
		output.println("</html>");
		
	}

}
