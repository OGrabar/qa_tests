package bots;

abstract public class Bot {

    private final String login;
    private final String password;
    private final String id;
    private final String name;


    Bot(String login, String password, String id, String name) {
        this.login = login;
        this.password = password;
        this.id = id;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    public String getId() {
        return id;
    }

    public String getProfileUrl() {
        return "https://ok.ru/profile/" + id;
    }

    public String getName() {
        return name;
    }
}
