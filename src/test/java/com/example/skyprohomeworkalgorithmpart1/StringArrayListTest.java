package com.example.skyprohomeworkalgorithmpart1;

import com.example.skyprohomeworkalgorithmpart1.exception.ElementNotFoundException;
import com.example.skyprohomeworkalgorithmpart1.exception.NoSuchIndexException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringArrayListTest {

    private final StringArrayList stringArrayList = new StringArrayList(3);

    @BeforeEach
    public void beforeEach() {
        stringArrayList.add("Hello");
        stringArrayList.add("Ok");
        stringArrayList.add("By");
    }

    @AfterEach
    public void afterEach() {
        stringArrayList.clear();
    }

    @Test
    public void addTest() {
        Assertions.assertThat(stringArrayList.add("Good")).isEqualTo("Good");
    }

    @Test
    public void addArgumentNullTest() {
        Assertions.assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> stringArrayList.add(null));
    }

    @Test
    public void addStringArrayListIsFullTest() {
        String[] newArray = {"Hello", "Ok", "By", "Good", null, null};
        stringArrayList.add("Good");
        Assertions.assertThat(stringArrayList.getStringArrayList()).isEqualTo(newArray);
    }

    @Test
    public void addIndexTest() {
        Assertions.assertThat(stringArrayList.add(1,"Good")).isEqualTo("Good");
    }

    @Test
    public void addIndexArgumentStringNullTest() {
        Assertions.assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> stringArrayList.add(1,null));
    }

    @Test
    public void addIndexMoreThenSizeOrLengthTest() {
        Assertions.assertThatExceptionOfType(NoSuchIndexException.class).isThrownBy(() -> stringArrayList.add(5,"Good"));
    }

    @Test
    public void addIndexStringArrayListIsFullTest() {
        String[] newArray = {"Hello", "Good", "Ok", "By", null, null};
        stringArrayList.add(1, "Good");
        Assertions.assertThat(stringArrayList.getStringArrayList()).isEqualTo(newArray);
    }

    @Test
    public void setTest() {
        Assertions.assertThat(stringArrayList.set(1,"Good")).isEqualTo("Good");
    }

    @Test
    public void setArgumentStringNullTest() {
        Assertions.assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> stringArrayList.set(1,null));
    }

    @Test
    public void setMoreThenSizeOrLengthTest() {
        Assertions.assertThatExceptionOfType(NoSuchIndexException.class).isThrownBy(() -> stringArrayList.add(5,"Good"));
    }

    @Test
    public void removeTest() {
        Assertions.assertThat(stringArrayList.remove("Ok")).isEqualTo("Ok");
    }

    @Test
    public void removeNotFoundTest() {
        Assertions.assertThatExceptionOfType(ElementNotFoundException.class).isThrownBy(() -> stringArrayList.remove("Good"));
    }

    @Test
    public void removeIndexTest() {
        Assertions.assertThat(stringArrayList.remove(1)).isEqualTo("Ok");
    }

    @Test
    public void removeIndexMoreThenSizeOrLengthTest() {
        Assertions.assertThatExceptionOfType(NoSuchIndexException.class).isThrownBy(() -> stringArrayList.remove(5));
    }

    @Test
    public void containsTest() {
        Assertions.assertThat(stringArrayList.contains("Ok")).isTrue();
    }

    @Test
    public void containsNoTest() {
        Assertions.assertThat(stringArrayList.contains("Good")).isFalse();
    }

    @Test
    public void indexOfTest() {
        Assertions.assertThat(stringArrayList.indexOf("Ok")).isEqualTo(1);
    }

    @Test
    public void lastIndexOfTest() {
        stringArrayList.add("Ok");
        Assertions.assertThat(stringArrayList.lastIndexOf("Ok")).isEqualTo(3);
    }

    @Test
    public void getTest() {
        Assertions.assertThat(stringArrayList.get(0)).isEqualTo("Hello");
    }

    @Test
    public void getNoSuchIndexTest() {
        Assertions.assertThatExceptionOfType(NoSuchIndexException.class).isThrownBy(() -> stringArrayList.get(7));
    }

    @Test
    public void equalsTest() {
        StringArrayList newArray = new StringArrayList(3);
        newArray.add("Hello");
        newArray.add("Ok");
        newArray.add("By");

        Assertions.assertThat(stringArrayList.equals(newArray)).isTrue();
    }

    @Test
    public void sizeTest() {
        Assertions.assertThat(stringArrayList.size()).isEqualTo(3);
    }

    @Test
    public void isEmptyTest() {
        stringArrayList.clear();
        Assertions.assertThat(stringArrayList.isEmpty()).isTrue();
    }

    @Test
    public void isNoEmptyTest() {
        Assertions.assertThat(stringArrayList.isEmpty()).isFalse();
    }

    @Test
    public void clearTest() {
        Assertions.assertThat(stringArrayList.isEmpty()).isFalse();
        stringArrayList.clear();
        Assertions.assertThat(stringArrayList.isEmpty()).isTrue();
    }

    @Test
    public void toArrayTest() {
        Assertions.assertThat(stringArrayList.toArray()).isEqualTo(stringArrayList.getStringArrayList());
    }

    @Test
    public void isArrayFullTest() {
        Assertions.assertThat(stringArrayList.isArrayFull()).isTrue();
    }

    @Test
    public void isArrayNoFullTest() {
        stringArrayList.add("Good");
        Assertions.assertThat(stringArrayList.isArrayFull()).isFalse();
    }

    @Test
    public void increasedStringArrayList() {
        Assertions.assertThat(stringArrayList.getStringArrayList().length).isEqualTo(3);
        stringArrayList.increasedStringArrayList();
        Assertions.assertThat(stringArrayList.getStringArrayList().length).isEqualTo(6);
    }

    @Test
    public void moveElementsToTheRightTest() {
        Assertions.assertThat(stringArrayList.get(1)).isEqualTo("Ok");
        stringArrayList.moveElementsToTheRight(0);
        Assertions.assertThat(stringArrayList.get(2)).isEqualTo("Ok");
    }

    @Test
    public void moveElementsToTheLeftTest() {
        Assertions.assertThat(stringArrayList.get(2)).isEqualTo("By");
        stringArrayList.moveElementsToTheLeft(1);
        Assertions.assertThat(stringArrayList.get(1)).isEqualTo("By");
    }




















}
