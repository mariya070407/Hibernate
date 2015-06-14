package DAO;


import logic.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {
    public void addUser(Users user) throws SQLException;     //добавить пользователя
    public void updateUser(Users user) throws SQLException;  //обновить пользователя
    public Users getUserById(Long id) throws SQLException;   //получить пользователя по id
    public List getAllUsers() throws SQLException;           //получить всех пользователей
    public void deleteUser(Users user) throws SQLException;  //удалить пользователя
}
