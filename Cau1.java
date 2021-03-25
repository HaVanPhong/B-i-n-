package baitapADan;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong, soCot;
        System.out.println("Nhập số dòng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        soCot = scanner.nextInt();
        int A[][] = new int[soDong][soCot];
        NhapMaTran(A, soDong, soCot);
        System.out.print("\n==== MA TRẬN VỪA NHẬP ====");
        XuatMaTran(A, soDong, soCot);

        SapXepMangHaiChieuCau1(A, soDong, soCot);
        System.out.print("\n==== MA TRẬN ĐÃ SẮP XẾP TĂNG DẦN  ====");
        XuatMaTran(A, soDong, soCot);
    }


    public static void NhapMaTran(int A[][], int m, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap A[" + i + "][" + j + "]= ");
                A[i][j] = scanner.nextInt();
            }
        }
    }

    public static void XuatMaTran(int A[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
        }
    }

    public static void SapXepMangHaiChieuCau1(int Array[][], int dong, int cot) {
        int n = dong * cot;
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (Array[m / cot][m % cot] > Array[j / cot][j % cot]) {
                    m = j;
                }
            }
            if (m != i) {
                int temp = Array[i / cot][i % cot];
                Array[i / cot][i % cot] = Array[m / cot][m % cot];
                Array[m / cot][m % cot] = temp;
            }
        }
    }
}
