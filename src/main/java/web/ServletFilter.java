package web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Marius
 */
public class ServletFilter implements Filter {

    private String LOGIN_ACTION_URI;

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        LOGIN_ACTION_URI = filterConfig.getInitParameter("loginActionURI");
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException,
            ServletException {
        final HttpServletRequest req = (HttpServletRequest) request;
        final HttpSession session = req.getSession();
        final String username = (String) session.getAttribute("user");

        if (!req.getRequestURI().equals("/lab5/")
                && !req.getRequestURI().equals("/lab5/home")
                && !req.getRequestURI().equals("/lab5/register")
                && !req.getRequestURI().matches(".*[.].*")) {

            if (username == null
                    && !LOGIN_ACTION_URI.equals(req.getRequestURI())) {
                final RequestDispatcher rd = req
                        .getRequestDispatcher("views/login/login.ftl");
                rd.forward(request, response);
                return;
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}
