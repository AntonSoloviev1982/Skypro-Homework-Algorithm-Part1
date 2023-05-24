package com.example.skyprohomeworkalgorithmpart1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayList implements StringList{

    private String [] stringArrayList;

    public StringArrayList(int size) {
        stringArrayList = new String[size];
    }

    public String[] getStringArrayList() {
        return stringArrayList;
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new NullPointerException();
        }
        boolean isAdd = false;
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] == null) {
                stringArrayList[i] = item;
                isAdd = true;
                break;
            }
        }
        if (isAdd) {
            String [] newArray = new String[stringArrayList.length * 2];
            int length = stringArrayList.length;
            System.arraycopy(stringArrayList, 0, newArray, 0, stringArrayList.length);
            stringArrayList = newArray;
            stringArrayList[length] = item;
        }
        return item;
    }


    @Override
    public String add(int index, String item) {
        return null;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

}
