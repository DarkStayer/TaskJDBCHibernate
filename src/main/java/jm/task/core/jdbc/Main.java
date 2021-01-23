package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Nilolay", "Nikolayevich", (byte) 35);
        userService.saveUser("Oleg", "Olegovich", (byte) 25);
        userService.saveUser("Ivan", "Ivanovich", (byte) 21);
        userService.saveUser("Sergey", "Sergeevich", (byte) 57);
        List<User> userList = userService.getAllUsers();
        for (User u:userList){
            System.out.println(u);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

