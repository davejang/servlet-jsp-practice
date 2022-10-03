package jdbc.controller;

import dao.RoleDao;
import dto.Role;

public class jdbcread {
    public static  void main(String[] args) {
        RoleDao dao = new RoleDao();
        Role role = dao.getRole(500);
        System.out.println(role);
    }
}
