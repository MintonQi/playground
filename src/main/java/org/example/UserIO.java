package org.example;

import java.io.*;

public class UserIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        User user = new User(1, "user01");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
//        oos.writeObject(user);
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
        User user = (User)ois.readObject();
        System.out.println(user.toString());
        ois.close();
    }
}
