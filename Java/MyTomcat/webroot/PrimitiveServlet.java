import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by sulvto on 2/14/19.
 */
public class PrimitiveServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = res.getWriter();
        out.println("Hello. Roses are red.");
        out.print("Violets are blue");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
