package baitapADan;

import java.util.Scanner;

public class Cau2 {
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

        SapXepMaTranCau2(A, soDong, soCot);
        System.out.print("\n==== MA TRẬN ĐÃ SẮP XẾP TĂNG DẦN THEO CỘT YÊU CẦU====");
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

    public static void SapXepMaTranCau2(int Array[][], int soDong, int soCot) {
        int cotSX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập vị trí cột cần sắp xếp(bắt đầu từ 1): ");
        cotSX = scanner.nextInt();
        cotSX--;
        for (int i = 1; i < soDong; i++) {
            for (int j = 0; j < soDong - i; j++) {
                if (Array[j][cotSX] > Array[j + 1][cotSX]) {
                    HoanViHang(Array, j, j + 1, soCot);
                }
            }
        }
    }

    public static void HoanViHang(int Ar[][], int m, int n, int soCot) { //hoãn vị hàng, m và n là 2 hàng cần hoán vị
        for (int i = 0; i < soCot; i++) {
            int temp = Ar[m][i];
            Ar[m][i] = Ar[n][i];
            Ar[n][i] = temp;
        }
    }
}
