package DAO;


import logic.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {
    public void addUser(Users user) throws SQLException;     //�������� ������������
    public void updateUser(Users user) throws SQLException;  //�������� ������������
    public Users getUserById(Long id) throws SQLException;   //�������� ������������ �� id
    public List getAllUsers() throws SQLException;           //�������� ���� �������������
    public void deleteUser(Users user) throws SQLException;  //������� ������������
}
