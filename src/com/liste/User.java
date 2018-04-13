package com.liste;

import java.util.Random;

/**
 * Class user
 * represente une Personne
 *
 * il est carracterise par son nom, son age et son sexe
 */
public class User {
    /**
     * Le nom de l'User,  ce nom est modifiable
     */
    String name;

    /**
     * L'age de l'User , cet age est modifiable
     */
    Integer age;
    /**
     * Le sexe du l'utilisateur , Il peut etre un homme (true) ou une femme (false)
     */
    boolean is_Male;

    /**
     * contructeur qui genere un User aleatoire
     */
    User(){
        setName(NameGenerator.generateName());
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        setAge(n);
        setIs_Male(rand.nextBoolean());
    }

    /**
     * Contructeur Definssanst un homme par défaut avec son nom et son age
     * @param nom l'identifiant de name de l'User
     * @param age l'identifian de  l'age de l'User
     */
    User(String nom, int age){
        setName(nom);
        setAge(age);
        setIs_Male(true);
    }

    /**
     * Contructeur Definssanst un homme ou une femme avec son nom et son age
     * @param nom l'identifiant de name de l'User
     * @param age l'identifiant de l'age de l'User
     * @param sexe le boolean definissant le sexe de l'User
     */
    User(String nom , int age , boolean sexe){
        setName(nom);
        setAge(age);
        setIs_Male(true);
    }

    /**
     * retourne le sexe
     * @return le sexe de l'User sous forme de boolean homme(true) femme (false)
     */
    public boolean isIs_Male() {
        return is_Male;
    }

    /**
     * retourne l'age
     * @return l'age sous forme d'entier
     */
    public Integer getAge() {
        return age;
    }

    /**
     * definit l'age
     * @param age definit l'age avec un entier
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * retourne le nom de l'user
     * @return le nom de l'user sous forme de texte
     */
    public String getName() {
        return name;
    }

    /**
     * definit le sexe de l'User
     * @param is_Male boolean definisant le sexe de l'User homme(true) femme (false)
     */
    public void setIs_Male(boolean is_Male) {
        this.is_Male = is_Male;
    }

    /**
     * definit le nom de l'User
      * @param name text symbolisant le nom a modifé de l'User
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * affichage d'un user
     * @return un texte representant un User
     */
    @Override
    public String toString() {
        if(is_Male) {
            return getName() + " " + getAge() +" Homme";
        }else{
            return getName() + " " + getAge() +" Femme";
        }
    }


}
