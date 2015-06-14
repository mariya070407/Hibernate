package DAO;

import DAO.Impl.UsersDAOImpl;

public class Factory {
    private static UsersDAO usersDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public UsersDAO getUsersDAO(){
        if (usersDAO == null){
            usersDAO = new UsersDAOImpl();
        }
        return usersDAO;
    }
}
