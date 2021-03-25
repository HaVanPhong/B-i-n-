package baitapADan.Cau3;

import java.util.Comparator;

public class Person  {
    private  String ten;
    private  String tenDem;
    private  int tuoi;

    public Person(String ten, String tenDem, int tuoi) {
        this.ten = ten;
        this.tenDem = tenDem;
        this.tuoi = tuoi;
    }

    public Person() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ten='" + ten + '\'' +
                ", tenDem='" + tenDem + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
