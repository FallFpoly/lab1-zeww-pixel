/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        // sinh viên code ở đây
            String HoVaTen;
            double DiemTB;
            Scanner scanner=new Scanner(System.in);
            System.out.print("Ho va Ten:");
            HoVaTen=scanner.nextLine();
            System.out.print("Diem TB:");
            DiemTB= scanner.nextDouble();
            System.out.println("Ho va Ten: " + HoVaTen);
            System.out.println("Diem Trung Binh: " + DiemTB);
    }
}
