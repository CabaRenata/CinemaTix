/**
 * 
 */
package web.servlet;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * @author Marius
 */
public class CustomHTTPServlet extends HttpServlet {
    private static final long serialVersionUID = -7189912196784360629L;

    @Override
    public void init(final ServletConfig config) throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
        super.init(config);
    }

}
