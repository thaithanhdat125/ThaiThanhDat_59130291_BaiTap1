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
public class HocSinh extends CaNhan
{   
    String lop;
    String nangKhieu;

    public HocSinh(String HoTen, int Tuoi, String DiaChi, String SĐT,String Lop, String NangKhieu) {
        super(HoTen, Tuoi, DiaChi, SĐT);
        this.lop = Lop;
        this.nangKhieu = NangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String Lop) {
        this.lop = Lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String NangKhieu) {
        this.nangKhieu = NangKhieu;
    }
    
    
    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "\n"
                + "Lop: "+lop+"\n"
                +"NangKhieu: "+nangKhieu; //To change body of generated methods, choose Tools | Templates.
    }
    
}
