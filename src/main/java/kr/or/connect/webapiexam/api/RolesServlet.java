package kr.or.connect.webapiexam.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.RoleDao;
import dto.Role;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "RolesServlet", value = "/roles")
public class RolesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        RoleDao dao = new RoleDao();

        List<Role> list = dao.getRoles();

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(list);

        PrintWriter out = response.getWriter();
        out.println(json);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
