package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Cookie3", value = "/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("cookie3.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String time = request.getParameter("time");
        Cookie cookie = new Cookie(key,value);
        cookie.setMaxAge(Integer.parseInt(time)*3600);
        response.addCookie(cookie);
    }
}
