package com.liste;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User());
        }


        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (int i = 0; i <users.size() ; i++) {
            System.out.println(users.get(i).toString());
        }
        System.out.println("");
        System.out.println("");
        users.removeIf(User::isIs_Male);

        for (int i = 0; i <users.size() ; i++) {
            System.out.println(users.get(i).toString());
        }
    }
}
