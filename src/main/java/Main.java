import java.io.*;

public class Main {
    public static void main (String[] args) {
        String file_name="men1.binary";
     Men st = new Men("Bob",20,"1234",1);

      /* System.out.println(st);
        try {
            FileOutputStream fos = new FileOutputStream(file_name);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(st);
out.close();
fos.close();
            fos = new FileOutputStream(file_name);
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
            fis = new FileInputStream(file_name);
            ObjectInputStream in = new ObjectInputStream(fis);
            Men st_new = (Men) in.readObject();
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
