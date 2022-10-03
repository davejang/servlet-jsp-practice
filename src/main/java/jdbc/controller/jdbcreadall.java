package jdbc.controller;

import java.util.List;

import dao.RoleDao;
import dto.Role;

public class jdbcreadall {
    public static void main(String[] args) {
        RoleDao dao = new RoleDao();

        List<Role> list = dao.getRoles();

        for(Role role : list) {
            System.out.println(role);
        }
    }
}
