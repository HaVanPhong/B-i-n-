package baitapADan.Cau3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        list.add(new Person("Phong", "Văn", 20));
        list.add(new Person("Duong", "Anh", 29));
        list.add(new Person("Dong", "Ba", 90));
        list.add(new Person("Minz", "Minh", 17));
        list.add(new Person("Max", "Phun", 20));
        list.add(new Person("Huong", "SiThaSon", 30));


        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        System.out.println("Danh sách Person sắp xếp theo tên: ");
        for (Person a : list) {
            System.out.println(a);
        }


        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getTenDem().compareTo(o2.getTenDem());
            }
        });
        System.out.println("Danh sách Person sắp xếp theo tên đệm: ");
        for (Person a : list) {
            System.out.println(a);
        }
    }
}
