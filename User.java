public class User {
    //Private Variablen der Klasse User.
    private String name;
    private int age;
    private int userid;
    //Konstruktor der Klasse User um diese direkt mit den übergebenen Parametern instanziieren zu können, da aufgrund von "private"
    //nicht anders darauf zugegriffen werden kann als über die Setter und Getter.
    public User(String name, int age, int userid) {
        this.name = name;
        this.age = age;
        this.userid = userid;
    }
    //Setter und Getter der Klasse User.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
