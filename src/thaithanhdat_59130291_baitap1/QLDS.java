/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaithanhdat_59130291_baitap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLDS implements IQLDS{
    ArrayList<CaNhan> dscn = new ArrayList<>();
    int dem=0,so=0;
    @Override
    public int them(CaNhan p) {
        dscn.add(p);
        return dscn.size();
    }
    @Override
    public int xoa(String ten) {
        for(CaNhan i : dscn)
        {if(i.HoTen==ten)
            dscn.remove(i);} 
      return dscn.size();
    }

    @Override
    public void inDS() {
        for(CaNhan i : dscn)
        {
            System.out.println("\nHoTen: " + i.HoTen + "\n"
                + "Tuoi: " + i.Tuoi + "\n"
                + "DiaChi: " + i.DiaChi + "\n"
                + "SĐT: " + i.SĐT);
            if(i instanceof GiaoVien)
            {
                System.out.print("Mon day: "+ ((GiaoVien) i).MonDay+"\n"
                         + "To Bo Mon: "+((GiaoVien) i).toBoMon+
                         "\n--------------------------------");
            }
            if(i instanceof HocSinh) System.out.print("Lop: "+((HocSinh) i).Lop+"\n"+
                     "Nang Khieu: "+ ((HocSinh) i).NangKhieu+
                     "\n--------------------------------");
        }
    }
    
}
