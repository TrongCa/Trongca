/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhanvien;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NVHD extends NHANVIEN{
    protected double soNgayCong;
    public NVHD(){
        
    }

    public NVHD(double soNgayCong, String maNV, String hoTen, Date ngaySinh, Date ngayVao) {
        super(maNV, hoTen, ngaySinh, ngayVao);
        this.soNgayCong = soNgayCong;
    }
    
    @Override
    public double tinhPhuCap() {
        if (tinhThamNien()>=10) {
            if (soNgayCong>=26) {
                return 500000;
            }
            else
                return 300000;
        }
        return 0;
    }

    @Override
    public double tinhLuong() {
        return LCB*soNgayCong/26+tinhPhuCap();
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay cong là: ");
        soNgayCong =sc.nextDouble();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("So ngay cong la: "+ soNgayCong);
        System.out.println("Luong nhan là: "+ tinhLuong());
    }
    
    
}
