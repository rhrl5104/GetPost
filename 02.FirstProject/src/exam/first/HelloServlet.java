package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */             
@WebServlet("/HelloServlet")	//URL Mapping
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//form에서 넘어오는 애중에 name으로 넘어오는 값이 -> NAME로 들어감. 
		String NAME = request.getParameter("name");
		String ID = request.getParameter("id");
		String PWD = request.getParameter("pwd");
		

		//out.println(NAME);
		//out.println(ID);
		//out.println(PWD);
		
		out.println("Hello - GET<br>");
		out.println("이름 : " + NAME + "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//form에서 넘어오는 애중에 name으로 넘어오는 값이 -> NAME로 들어감. 
		String NAME = request.getParameter("name");
		String ID = request.getParameter("id");
		String PWD = request.getParameter("pwd");
		
		//out.println(NAME);
		//out.println(ID);
		//out.println(PWD);
		
		//out.print("<html>");
		out.print("Hello - POST<br>");
		out.print("이름 : " + NAME + "<br>");
		//out.print("</html>");
	}

}
