package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDaoHibernateImpl service = new UserDaoHibernateImpl();
        service.createUsersTable();
        service.saveUser("Nikolay", "Nikolayevich", (byte) 35);
        service.saveUser("Oleg", "Olegovich", (byte) 25);
        service.saveUser("Ivan", "Ivanovich", (byte) 21);
        service.saveUser("Sergey", "Sergeevich", (byte) 57);
        List<User> userList = service.getAllUsers();
        for (User u : userList) {
            System.out.println(u);
        }
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}

