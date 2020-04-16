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
        {if(i.hoTen==ten)
            dscn.remove(i);} 
      return dscn.size();
    }

    @Override
    public void inDS() {
        for(CaNhan i : dscn)
        {
            System.out.println("\nHọ Tên: " + i.hoTen + "\n"
                + "Tuổi: " + i.tuoi + "\n"
                + "Địa Chỉ: " + i.diaChi + "\n"
                + "Số ĐT: " + i.soDT);   
            if(i instanceof GiaoVien)
            {
                System.out.print("Môn Dạy: "+ ((GiaoVien) i).monDay+"\n"
                         + "Tổ Bộ Môn: "+((GiaoVien) i).toBoMon+
                         "\n--------------------------------");
            }
            if(i instanceof HocSinh) System.out.print("Lớp: "+((HocSinh) i).lop+"\n"+
                     "Năng Khiếu: "+ ((HocSinh) i).nangKhieu+
                     "\n--------------------------------");
        }
    }
    
}
