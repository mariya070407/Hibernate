package logic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//@Entity Ч указывает на то, что данный класс €вл€етс€ сущностью.
//Table Ч задает им€ таблицы, в которой будут хранитьс€ объекты класса
@Entity
@Table(name="Users")
public class Users {
    //@Id Ч обозначает поле id
    //@GeneratedValue и @GenericGenerator Ч указывает на то, как будет генерироватьс€ id (у нас Ч по возрастанию)
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id_user")
    private Long id_user;

    @Column(name="login")
    private String login;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;

    public Users(){
        login=null;
        password=null;
        name=null;
    }


    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
