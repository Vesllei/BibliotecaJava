package Controller;

import java.util.List;

import Models.User;

public class Registeredusers {
    List<User> users;

    public Registeredusers(List<User> users) {
        this.users = users;
    }

    public User searchUsers(String name) {
        return users.stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);
    }

    public void report() {
        for (User user : users) {
            System.out.println("____________________________________" + "\n" +
                    "Nome: " + user.getName() + "\n" +
                    "Telefone: " + user.getTel() + "\n" +
                    "Email: " + user.getEmail() + "\n" +
                    "____________________________________");
        }

    }

    public void addUser(User us) {
        if (searchUsers(us.getName()) == null) {
            users.add(us);
        }
    }

    public void removeUser(User us) {
        if (searchUsers(us.getName()) == us) {
            users.remove(us);
        }
    }

    @Override
    public String toString() {
        return "Registeredusers [Usuario=" + users + "]";
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}