package br.com.emeath.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter output = resp.getWriter();
		output.println("<html>");
		
		output.println("<head>");
		output.println("	<title>Hello World!</title>");
		output.println("	<link rel=\"stylesheet\" href=\"styles.css\">");
		output.println("</head>");

		output.println("<body>");
		output.println("<p>Este é um servlet. Isto é, um <strong>objeto Java especial</strong> que pode ser \"invocado\" pela URL. Dentro dele existe lógica para geração de conteúdo em html de <strong>forma dinâmica.</strong></p>");
		output.println("<br>");
		output.println("<hr>");
		output.println("<br>");
		output.println("<p><i>Observação: este servlet monta o HTML não seguindo boa prática. Os próximos irão evoluir e seguir a recomendação</i> :)</p>");
		output.println("</body>");
		
		output.println("</html>");
		
		System.out.println("Servlet HelloWorldServlet recebeu requisição HTTP e respondeu!");
	}
}
