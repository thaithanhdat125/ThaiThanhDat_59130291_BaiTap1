/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_59130291_baitap1;

/**
 *
 * @author Admin
 */
public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String soDT;

    public CaNhan(String hoTen, int tuoi, String diaChi, String soDT) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
    public String HienThiTT()
    {
        return "Họ Tên: " + hoTen + "\n"
                + "Tuổi: " + tuoi + "\n"
                + "Địa Chỉ: " + diaChi + "\n"
                + "Số Điện Thoại: " + soDT;
    }
}
