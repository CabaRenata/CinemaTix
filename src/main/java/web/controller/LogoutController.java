package web.controller;

import org.springframework.stereotype.Controller;
import ro.pdpj.lab5.web.servlet.CustomHTTPServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Marius
 */
@Controller
public class LogoutController extends CustomHTTPServlet {
    private static final long serialVersionUID = -3599074456425331940L;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("home");
    }
}
