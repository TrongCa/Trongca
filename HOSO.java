/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_hoso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public abstract class HOSO {
    protected String maHS;
    protected String hoTen;
    protected long soCMND;
    protected Date ngaySinh;
    public HOSO(){
        
    }

    public HOSO(String maHS, String hoTen, long soCMND, Date ngaySinh) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.ngaySinh = ngaySinh;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public long getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(long soCMND) {
        this.soCMND = soCMND;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma ho so");
        maHS = sc.nextLine();
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        System.out.println("Nhap chung minh nhan dan");
        soCMND = sc.nextLong();
        System.out.println("Nhap ngay vao");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngaySinh = df.parse(sc.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(HOSO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Xuat(){
        System.out.println("Ma ho so la: ");
        System.out.println("Ho ten la: ");
        System.out.println("So chung minh nhan dan la: ");
        System.out.println("Ngay vao la: ");
    }
    public abstract String danhGiaXepLoai();
}
