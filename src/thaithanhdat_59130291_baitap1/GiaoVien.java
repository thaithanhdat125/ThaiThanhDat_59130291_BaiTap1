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
public class GiaoVien extends CaNhan
{
    String MonDay;
    String toBoMon;

    public GiaoVien(String HoTen, int Tuoi, String DiaChi, String SĐT,String MonDay, String toBoMon) {
        super(HoTen, Tuoi, DiaChi, SĐT);
        this.MonDay = MonDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return MonDay;
    }

    public void setMonDay(String MonDay) {
        this.MonDay = MonDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
                return super.HienThiTT() + "\n"
                + "Monday: "+MonDay+"\n"
                +"toBoMon: "+toBoMon; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
