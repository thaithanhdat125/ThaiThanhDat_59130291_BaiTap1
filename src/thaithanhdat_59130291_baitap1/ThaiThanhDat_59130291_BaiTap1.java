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
public class ThaiThanhDat_59130291_BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CaNhan hs1 = new HocSinh("hs1",21, "14NgCongTru1", "0581131", "59CNTT31", "DauHoiCucManh1");
        CaNhan gv1 = new GiaoVien("gv1",69,"Nha Trang1","10230121","Mẫu Thiết kế1", "Công Nghệ Thông Tin1");
        CaNhan gv2 = new GiaoVien("gv2",69,"Nha Trang2","10230122","Mẫu Thiết kế2", "Công Nghệ Thông Tin2");
        CaNhan gv3 = new GiaoVien("gv3",69,"Nha Trang3","10230123","Mẫu Thiết kế3", "Công Nghệ Thông Tin3");
        CaNhan gv4 = new GiaoVien("gv4",69,"Nha Trang4","10230124","Mẫu Thiết kế4", "Công Nghệ Thông Tin4");
        CaNhan hs2 = new HocSinh("hs2",21, "14NgCongTru2", "0581132", "59CNTT32", "DauHoiCucManh2");
        CaNhan hs3 = new HocSinh("hs3",21, "14NgCongTru3", "0581133", "59CNTT33", "DauHoiCucManh3");
        CaNhan hs4 = new HocSinh("hs4",21, "14NgCongTru4", "0581134", "59CNTT34", "DauHoiCucManh4");
        LopHoc dslh = new LopHoc();
        dslh.themHocSinh((HocSinh) hs1);
        dslh.themHocSinh((HocSinh) hs2);
        dslh.themHocSinh((HocSinh) hs3);
        dslh.themHocSinh((HocSinh) hs4);
        dslh.themGiaoVien((GiaoVien) gv1);
        dslh.themGiaoVien((GiaoVien) gv2);
        dslh.themGiaoVien((GiaoVien) gv3);
        dslh.themGiaoVien((GiaoVien) gv4);
        dslh.inDSHS();
        dslh.inDSGV();
        
        
        
        
    }
    
}
