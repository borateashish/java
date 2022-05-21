import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<b>Welcome to my Servlet World...!!!</b>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
}
