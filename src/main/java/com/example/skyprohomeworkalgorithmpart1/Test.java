package com.example.skyprohomeworkalgorithmpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringArrayList stringArrayList = new StringArrayList(3);
        stringArrayList.add("Privet");
        stringArrayList.add("Poka");
        stringArrayList.add("Kak dela");

        System.out.println(Arrays.toString(stringArrayList.getStringArrayList()));
    }
}
