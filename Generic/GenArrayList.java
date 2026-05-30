package Generic;

import java.util.ArrayList;

public class GenArrayList {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();// in this code you'll get the execption because u are taking 
        //any type of data in ArrayList that's not the problem, the problem is in line no.13
        list.add("hello Riya");
        list.add(123);
String s1 = (String) list.get(0);
String s2 =(String) list.get(1); // you are taking integer list element as string. by typecasting it will generate exception while run time


ArrayList<String> list2 =new ArrayList<>(); // here we <String> define that all element will be string type.. so no exception and that is Generic
list2.add("hello ");
list2.add("Riya");
list2.get(0);
list2.get(1);

    }
}