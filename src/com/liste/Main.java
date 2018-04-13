package com.liste;

import java.sql.DatabaseMetaData;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * creation d'une liste de Personnes / User  et remplissage
         */
        ArrayList<User> users = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            users.add(new User());
        }


        /**
         * tri alphabetic compare
         */
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        /**
         * affichage des users
         */
        for (int i = 0; i <users.size() ; i++) {
            System.out.println(users.get(i).toString());
        }
        System.out.println("");
        System.out.println("");

        /**
         * retire tout les hommes de la liste
         */
        users.removeIf(User::isIs_Male);

        /**
         * affichage des users avec un iterateur
         */
        Iterator itr = users.iterator();
        while (itr.hasNext()){
            User element = (User) itr.next();
            System.out.println(element.toString());
        }
    }
}
