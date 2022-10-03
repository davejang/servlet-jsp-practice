package jdbc.controller;

import dao.RoleDao;
import dto.Role;

public class jdbcupdate {
    public static void main(String[] args) {
        int roleId = 500;
        String description = "CEO";

        Role role = new Role(roleId,description);

        RoleDao dao = new RoleDao();
        int updateCount = dao.updateRole(role);

        System.out.println(updateCount);
    }
}
