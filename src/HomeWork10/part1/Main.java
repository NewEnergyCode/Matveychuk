package HomeWork10.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("first");
        stringArrayList.add("second");
        stringArrayList.add("yes");
        stringArrayList.add("no");
        stringArrayList.add("pig");
        stringArrayList.add("box");
        stringArrayList.add("seven");
        stringArrayList.add("Bob");
        stringArrayList.add("car");
        stringArrayList.add("pink");
        stringArrayList.add("road");
        stringArrayList.add("gun");
        stringArrayList.add("sun");
        stringArrayList.add("mouse");
        stringArrayList.add("finish");

        ArrayList<String> listStr2 = new ArrayList<>();
        listStr2.add("first");
        listStr2.add("first");
        listStr2.add("yes");
        listStr2.add("no");
        listStr2.add("seven");
        listStr2.add("seven");
        listStr2.add("seven");


        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(2);
        listInt.add(2);
        listInt.add(3);
        listInt.add(23);


        countOccurance(stringArrayList);
        toList();
        System.out.println(findUnique(listInt));
        calcOccurance(listStr2);
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

    public static ArrayList<Integer> findUnique(ArrayList<Integer> list) {

        ArrayList<Integer> findUnique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer unic = list.get(i);
            int flag = 1;
            for (int j = 0; j < list.size(); j++) {
                if ((i != j) && (list.get(j).equals(unic))) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                findUnique.add(unic);
            }

        }
        return findUnique;

    }

    public static void calcOccurance(ArrayList<String> list) {


        Map<Object, Integer> counter = new HashMap<>();
        for (String x : list) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }

        System.out.println(counter);


    }


}


