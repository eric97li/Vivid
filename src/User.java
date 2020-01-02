import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    List<User> users = new ArrayList<User>();

    public User() {

    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addUser(User obj) {
        users.add(obj);
    }

    public User getUser(String name, int id) {
        for(int i = 0; i < users.size(); i++) {
            if(((users.get(i).getName()).equals(name)) && ((users.get(i).getId())== id)) {
                return users.get(i);
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
