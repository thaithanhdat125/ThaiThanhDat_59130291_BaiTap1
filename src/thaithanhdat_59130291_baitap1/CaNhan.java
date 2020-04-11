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
        String HoTen;
    int Tuoi;
    String DiaChi;
    String SĐT;

    public CaNhan(String HoTen, int Tuoi, String DiaChi, String SĐT) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.SĐT = SĐT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }
    public String HienThiTT()
    {
        return "HoTen: " + HoTen + "\n"
                + "Tuoi: " + Tuoi + "\n"
                + "DiaChi: " + DiaChi + "\n"
                + "SĐT: " + SĐT;
    }
}
