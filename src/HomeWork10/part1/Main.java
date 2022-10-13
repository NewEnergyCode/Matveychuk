package HomeWork10.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list0 = new ArrayList<>();
        list0.add("first");
        list0.add("second");
        list0.add("yes");
        list0.add("no");
        list0.add("pig");
        list0.add("box");
        list0.add("seven");
        list0.add("Bob");
        list0.add("car");
        list0.add("pink");
        list0.add("road");
        list0.add("gun");
        list0.add("sun");
        list0.add("mouse");
        list0.add("finish");
//        System.out.println("Result: " + list0);
//        System.out.println(list0.size());
        countOccurance(list0);
        toList();
    }

    public static void countOccurance(ArrayList<String> list) {
        int a = 0;
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("friend");
        list2.add("zero");
        list2.add("good");
        list2.add("non");
        list2.add("pig");
        list2.add("box");
        list2.add("loading");
        list2.add("Max");
        list2.add("plane");
        list2.add("black");
        list2.add("road");
        list2.add("run");
        list2.add("sun");
        list2.add("horse");
        list2.add("finish");
        for (String s : list) {
            if (list2.contains(s)) {
                a++;
            }

        }
        System.out.println(a);
    }

    public static ArrayList<String> toList() {
        String[] arrayString = {"first", "second", "yes", "no"};

        ArrayList<String> listSrting = new ArrayList<>();

        Collections.addAll(listSrting, arrayString);

        System.out.println(listSrting);

        return listSrting;
    }



}

