 import java.io.*;
        import javax.servlet.*;
        import javax.servlet.http.*;
public class 
servlet2 extends HttpServlet implements Servlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<html><body><h2>Information about Server</h2>");
        pw.println("<br>Server Name: "+req.getServerName());
        pw.println("<br>Server Port: "+req.getServerPort());
	pw.println("<h2>Information about Client</h2>");
        pw.println("<br>Ip Address: "+req.getRemoteAddr());
        pw.println("<br>Client Browser: "+req.getHeader("User-Agent"));
	pw.println("<br>Name: "+req.getRemoteHost());
        pw.println("</body></html>");
        pw.close();
    }
}
