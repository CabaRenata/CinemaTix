package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ro.pdpj.lab5.model.User;
import ro.pdpj.lab5.service.UserService;
import ro.pdpj.lab5.web.servlet.CustomHTTPServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marius
 */
@Controller
public class RegisterUserController extends CustomHTTPServlet {

    /**
	 * 
	 */
    private static final long serialVersionUID = 4386829468065838572L;
    @Autowired
    private UserService userService;

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("views/login/register.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {
        final String userName = req.getParameter("username");
        final String password = req.getParameter("password");

        final User u = new User();

        u.setUsername(userName);
        u.setPassword(password);

        final List<String> errors = new ArrayList<String>();
        User u2 = new User();
        u2 = userService.getUserByUsername(u.getUsername());
        if (u2 != null) {
            errors.add("Username is already taken!");
        }
        try {

            if (errors.size() > 0) {
                req.setAttribute("errors", errors);
                req.getRequestDispatcher("views/login/register.ftl").forward(req, res);
            }
            else {
                userService.save(u);
                req.getRequestDispatcher("views/login/login.ftl").forward(req, res);
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }

    }
}
