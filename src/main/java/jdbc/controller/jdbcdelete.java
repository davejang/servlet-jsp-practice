package jdbc.controller;

import dao.RoleDao;
import dto.Role;

public class jdbcdelete {
    public static void main(String[] args) {
        int roleId = 500;

        RoleDao dao = new RoleDao();
        int deleteCount = dao.deleteRole(roleId);
        
        System.out.println(deleteCount);
    }
}
