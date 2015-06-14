package main;

import DAO.Factory;
import logic.Users;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Создадим двух пользователей
        Users s1 = new Users();
        Users s2 = new Users();

        //Проинициализируем их
        s1.setName("Ivanov Ivan");
        s1.setLogin("Vanya");
        s1.setPassword("123");
        s2.setName("Petrova Alisa");
        s2.setLogin("Alise");
        s2.setPassword("qwerty");

        //Сохраним их в бд, id будут сгенерированы автоматически
        Factory.getInstance().getUsersDAO().addUser(s1);
        Factory.getInstance().getUsersDAO().addUser(s2);

        //Выведем всех пользователей из бд
        List<Users> studs = Factory.getInstance().getUsersDAO().getAllUsers();
        System.out.println("========AllUsers=========");
        for(int i = 0; i < studs.size(); ++i) {
            System.out.println("Name : " + studs.get(i).getName() + ", Login : " + studs.get(i).getLogin() +",  id : " + studs.get(i).getId_user());
            System.out.println("=============================");
        }
    }
}
