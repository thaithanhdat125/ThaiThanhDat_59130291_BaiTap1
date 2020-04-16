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
    String monDay;
    String toBoMon;

    public GiaoVien(String hoTen, int tuoi, String diaChi, String soDT,String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, soDT);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
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
                + "Monday: "+monDay+"\n"
                +"toBoMon: "+toBoMon; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
