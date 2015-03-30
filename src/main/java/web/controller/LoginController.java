package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.UserService;
import web.servlet.CustomHTTPServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Marius
 */
@Controller
public class LoginController extends CustomHTTPServlet {

    /**
	 * 
	 */
    @Autowired
    private UserService userService;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("views/login/login.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {
        final String userName = req.getParameter("username");
        final String password = req.getParameter("password");

        String dest = req.getHeader("Referer");

        if (dest == null || dest.endsWith("login")) {
            dest = "";
        }
        else {
            dest = dest.substring(dest.lastIndexOf("/") + 1);
        }

        final boolean valid = userService.validLogin(userName, password);
        if (valid) {
            final HttpSession session = req.getSession();
            session.setAttribute("user", userName);

        }
        else {
            dest = "views/login/loginFailed.ftl";
            req.getRequestDispatcher(dest).forward(req, res);
        }
        res.sendRedirect(dest);

    }
}
