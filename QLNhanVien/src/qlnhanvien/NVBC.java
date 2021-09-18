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
public class NVBC extends NHANVIEN{
    protected double HSL;
    public NVBC(){
        
    }

    public NVBC(double HSL, String maNV, String hoTen, Date ngaySinh, Date ngayVao) {
        super(maNV, hoTen, ngaySinh, ngayVao);
        this.HSL = HSL;
    }

    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }
    

    @Override
    public double tinhPhuCap() {
        if (tinhThamNien()>=10) {
            return 2000000;
        }
        else
            return 500000;
    }

    @Override
    public double tinhLuong() {
        return LCB*HSL+tinhPhuCap();
    }
    @Override
    public void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he song luong: ");
        HSL=sc.nextDouble();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("He so luong la: "+ HSL);
        System.out.println("Luong nhan duoc la: "+ tinhLuong());
    }
    
    
}
