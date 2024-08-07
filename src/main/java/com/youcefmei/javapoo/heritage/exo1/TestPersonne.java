package com.youcefmei.javapoo.heritage.exo1;

public class TestPersonne {

    public static void main(String[] args) {
        Personne  personne = new Personne("abc","frouard");
        System.out.println(personne);

        Student student = new Student("abc","frouard","cda",1,2);
        System.out.println(student);

        Staff staff = new Staff("abc","frouard","cda",1000);
        System.out.println(staff);




    }
}
