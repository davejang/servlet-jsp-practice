package jdbc.controller;

import dto.Role;
import dao.RoleDao;

public class jdbcinsert {
    public static void main(String[] args) {
        int roleId = 500;
        String description = "CTO";

        Role role = new Role(roleId,description);

        RoleDao dao = new RoleDao();
        int insertCount = dao.addRole(role);

        System.out.println(insertCount);
    }
}
