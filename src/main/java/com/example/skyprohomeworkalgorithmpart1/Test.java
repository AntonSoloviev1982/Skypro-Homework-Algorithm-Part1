package com.example.skyprohomeworkalgorithmpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringArrayList stringArrayList = new StringArrayList(4);
        stringArrayList.add("Privet");
        stringArrayList.add("Poka");
        stringArrayList.add("No");
        stringArrayList.add("Yes");
        stringArrayList.add("Ok");
        stringArrayList.add("Tre");
        stringArrayList.add("Ok");
        stringArrayList.add("Yes");
        System.out.println(Arrays.toString(stringArrayList.getStringArrayList()));
        System.out.println(stringArrayList.get(2));

        System.out.println(Arrays.toString(stringArrayList.getStringArrayList()));
        System.out.println(stringArrayList.size());
    }
}
