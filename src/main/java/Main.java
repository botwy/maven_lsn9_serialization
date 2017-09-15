import java.io.*;

public class Main {
    public static void main (String[] args) {
    //   Student st = new Student("Bob",20,"1234",1);

     //  System.out.println(st);
      /*  try {
            FileOutputStream fos = new FileOutputStream("D:\\1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(st);
out.close();
fos.close();
            fos = new FileOutputStream("D:\\1.txt");
            out = new ObjectOutputStream(fos);
            st.setAge(99);
            out.writeObject(st);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\1.txt");
            ObjectInputStream in = new ObjectInputStream(fis);
            Student st_new = (Student) in.readObject();
            System.out.println(st_new);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
