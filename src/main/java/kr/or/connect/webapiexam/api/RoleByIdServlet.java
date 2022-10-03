package kr.or.connect.webapiexam.api;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.RoleDao;
import dto.Role;

@WebServlet(name = "RoleByIdServlet", value = "/roles/*")
public class RoleByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        String pathInfo = request.getPathInfo();
        String[] pathParts = pathInfo.split("/");
        String idStr = pathParts[1];
        int id = Integer.parseInt(idStr);

        RoleDao dao = new RoleDao();
        Role role = dao.getRole(id);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(role);

        PrintWriter out = response.getWriter();
        out.println(json);
        out.close();
    }
}
