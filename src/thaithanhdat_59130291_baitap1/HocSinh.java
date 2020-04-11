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
    String Lop;
    String NangKhieu;

    public HocSinh(String HoTen, int Tuoi, String DiaChi, String SĐT,String Lop, String NangKhieu) {
        super(HoTen, Tuoi, DiaChi, SĐT);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getNangKhieu() {
        return NangKhieu;
    }

    public void setNangKhieu(String NangKhieu) {
        this.NangKhieu = NangKhieu;
    }
    
    
    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "\n"
                + "Lop: "+Lop+"\n"
                +"NangKhieu: "+NangKhieu; //To change body of generated methods, choose Tools | Templates.
    }
    
}
