package com.example.backendstudy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    public LogicServlet() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int v1 = (int)(Math.random() * 100) + 1;
        int v2 = (int)(Math.random() * 100) + 1;
        int result = v1 + v2;

        request.setAttribute("v1", v1);
        request.setAttribute("v2", v2);
        request.setAttribute("result", result);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/result.jsp");
        requestDispatcher.forward(request, response);
    }
}
