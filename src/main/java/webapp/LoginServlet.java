package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}
	private userValidation service = new userValidation();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("name", name );
		String password  = request.getParameter("password");
		request.setAttribute("password", password);		
		boolean isUserValid = service.isVAlid(name, password);
		if(isUserValid){
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);			
		}else{
			String error = "you entered a wrong password or usename";
			request.setAttribute("error", error);
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}


	}
}