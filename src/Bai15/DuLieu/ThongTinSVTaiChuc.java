package Bai15.DuLieu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ThongTinSVTaiChuc extends ThongTinSV {

    private String noiLienKet;

    public ThongTinSVTaiChuc(String heSV, String maSV, String hoTen, LocalDate sinhNhat, int namVaoHoc, int diemDauVao, List<KetQuaHocTap> ketQuaHocTapArrayList, String noiLienKet) {
        super(heSV, maSV, hoTen, sinhNhat, namVaoHoc, diemDauVao, ketQuaHocTapArrayList);
        this.noiLienKet = noiLienKet;
    }

    public String getNoiLienKet() {
        return noiLienKet;
    }

    public void setNoiLienKet(String noiLienKet) {
        this.noiLienKet = noiLienKet;
    }
}
