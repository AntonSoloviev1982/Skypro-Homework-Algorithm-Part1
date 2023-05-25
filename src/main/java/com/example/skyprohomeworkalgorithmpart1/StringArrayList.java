package com.example.skyprohomeworkalgorithmpart1;


import com.example.skyprohomeworkalgorithmpart1.exception.ElementNotFoundException;
import com.example.skyprohomeworkalgorithmpart1.exception.NoSuchIndexException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringArrayList implements StringList {

    private String[] stringArrayList;

    public StringArrayList(int size) {
        stringArrayList = new String[size];
    }

    public String[] getStringArrayList() {
        return stringArrayList;
    }


    @Override
    public String add(String item) {
        if (item == null) {
            throw new NullPointerException("String is null");
        }
        if (isArrayFull()) {
            increasedStringArrayList();
        }
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] == null) {
                stringArrayList[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (index >= stringArrayList.length || index >= size()) {
            throw new NoSuchIndexException("Index is more then array's length");
        }
        if (item == null) {
            throw new NullPointerException("String is null");
        }
        if (isArrayFull()) {
            increasedStringArrayList();
        }
        moveElementsToTheRight(index);
        stringArrayList[index] = item;
        return item;
    }


    @Override
    public String set(int index, String item) {
        if (index >= stringArrayList.length || index >= size()) {
            throw new NoSuchIndexException("Index is more then array's length or array's size");
        }
        if (item == null) {
            throw new NullPointerException("String is null");
        }
        stringArrayList[index] = item;
        return null;
    }

    @Override
    public String remove(String item) {
        int index = 0;
        if (contains(item)) {
            for (int i = 0; i < size(); i++) {
                if (stringArrayList[i] == item) {
                    index = i;
                    stringArrayList[i] = null;
                }
            }
            moveElementsToTheLeft(index);
        } else {
            throw new ElementNotFoundException();
        }
        return item;
    }

    @Override
    public String remove(int index) {
        if (index >= size()) {
            throw new NoSuchIndexException("Index is more then array's size");
        }
        String result = stringArrayList[index];
        stringArrayList[index] = null;
        moveElementsToTheLeft(index);
        return result;
    }

    @Override
    public boolean contains(String item) {
        boolean result = false;
        for (int i = 0; i < stringArrayList.length; i++) {
            if (stringArrayList[i] == item) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int indexOf(String item) {
        int result = -1;
        for (int i = 0; i < size(); i++) {
            if (stringArrayList[i] == item) {
                result = i;
            }
        }
        return result;
    }

    @Override
    public int lastIndexOf(String item) {
        int result = -1;
        for (int i = (size() - 1); i > 0; i--) {
            if (stringArrayList[i] == item) {
                result = i;
                break;
            }
        }
        return result;
    }

    @Override
    public String get(int index) {
        if (index >= size()) {
            throw new NoSuchIndexException("Index is more then array's size");
        }
        return stringArrayList[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        boolean result = true;
        if (otherList == null) {
            throw new NullPointerException("Argument is null");
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) != otherList.get(i)) {
                result = false;
                break;
            }
        }
        if (this.size() != otherList.size()) {
            result = false;
        }
        return result;
    }

    @Override
    public int size() {
        return (int) Arrays.stream(stringArrayList).filter(e -> e != null).count();
    }

    @Override
    public boolean isEmpty() {
        boolean result = false;
        if (size() == 0) {
            result = true;
        }
        return result;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size(); i++) {
            stringArrayList[i] = null;
            System.out.println(i);
        }
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }


    public boolean isArrayFull() {
        boolean isFull = false;
        if (stringArrayList[stringArrayList.length - 1] != null) {
            isFull = true;
        }
        return isFull;
    }

    public void increasedStringArrayList() {
        String[] newArray = new String[stringArrayList.length * 2];
        System.arraycopy(stringArrayList, 0, newArray, 0, stringArrayList.length);
        stringArrayList = newArray;
    }

    public void moveElementsToTheRight(int index) {
        for (int i = stringArrayList.length - 1; i > index; i--) {
            stringArrayList[i] = stringArrayList[i - 1];
        }
    }


    public void moveElementsToTheLeft(int index) {
        for (int i = index; i < size(); i++) {
            stringArrayList[i] = stringArrayList[i + 1];
            stringArrayList[i + 1] = null;
        }
    }

}
