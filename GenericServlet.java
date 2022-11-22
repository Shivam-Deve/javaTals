package servletTalk;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class GenericServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        // create a writer and write onto client page
        PrintWriter out = res.getWriter();
        out.println(num1 + num2);

    }
}
