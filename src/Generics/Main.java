package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Person<Integer,String> PersonInt = new Person<>(12,"Cuong",31,"Ha Nam");
//        Person<Integer, String> PersonStg = new Person<>(14, "Xuan loc", 29,"Quang nam");
//        Person<Long, String> PersonFloat = new Person<>(12L, "Gia Han",5,"Ninh Binh");
//        Person<Double, String> PersonDouble = new Person<>(123.1, "Nhat Minh", 1,"Ninh Binh");
//        ArrayList<Person> ListPerson = new ArrayList<Person>();
//        ListPerson.add(PersonInt);
//        ListPerson.add(PersonStg);
//        ListPerson.add(PersonFloat);
//        ListPerson.add(PersonDouble);
//        for (Person person: ListPerson){
//            System.out.println(person.getId());
//            System.out.println(person.getName());
//            System.out.println(person.getAddress());
//            System.out.println(person.getAge());
//            System.out.println("////////////////////////");
//
//        }
        printer("Cuong");
        printer(1234553);
        printer(true);


    }


/*
Phương thức generics: có thể cho linh hoạt kiểu dữ liệu của Param
 */
    public static <T> void printer(T value){
        System.out.println(value);
    }


}
