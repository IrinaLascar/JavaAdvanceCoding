package ro.sda.advanced._1_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JavaArrayList {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();

        myList.add("string 1");
        myList.add("string 2");
        myList.add("string 3");
        myList.add("string 4");

        myList.remove(1);
        myList.set(2, "another element");

        for (String s : myList) {
            System.out.println(s);
        }

        myList.clear();
        System.out.println("--------------");

        System.out.println(myList);

        System.out.println(myList.contains("string 3"));

        List<MyClass> anotherList = new ArrayList<>();

        anotherList.add(new MyClass("a"));
        anotherList.add(new MyClass("b"));
        anotherList.add(new MyClass("c"));

        System.out.println(anotherList.contains(new MyClass("b")));


        System.out.println(Objects.hash("leo messi"));


    }
}

class MyClass {
    String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return this.name.equals(myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
