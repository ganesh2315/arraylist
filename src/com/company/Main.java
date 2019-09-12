package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

       /* for (int i=0;i<animals.size();i++){
            System.out.println("Animals :"+animals.get(i));
        }
        System.out.println("*******************************************************8");*/
       animals.remove(0);
       animals.remove("Cat");
       if (animals.contains("Monkey")){
           animals.remove("Monkey");
       }else
       {
           animals.add("Chicken");
       }


       if (animals.isEmpty()){
           System.out.println("animals is empty");
       }else {
           for (String animal : animals) {
               System.out.println("Animals are:" + animal);

           }
       }

        System.out.println("size:"+animals.size());
    }
}
