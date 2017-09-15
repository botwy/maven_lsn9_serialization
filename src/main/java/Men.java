import java.io.Serializable;

public class Men implements Serializable{
    private static final long serialVersionUID = 1234L;  //!!! private static final long serialVersionUID
    private String name;
    private int age;
    transient private String password;
  /*  private enum  cours {
        FIRST,SECOND
    };*/

    private int cours;
//    private float stipend=100f;

    public Men() {
    }

    public Men(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Men(String name, int age, String password, int cours) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Men{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", cours=" + cours +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void writeReplace(){
        //Object o = new Object();

    }
}
