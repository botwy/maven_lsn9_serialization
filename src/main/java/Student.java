import java.io.Serializable;

public class Student implements Serializable{
    private  static long serialVersionUID = 1;
    private String name;
    private int age;
   transient private String password;
  /*  private enum  cours {
        FIRST,SECOND
    };*/

private int cours;
//private float stipend;

    public Student() {
    }

    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Student(String name, int age, String password, int cours) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student{" +
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
