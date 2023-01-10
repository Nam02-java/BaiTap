package Bai15.DuLieu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ThongTinSVChinhQuy extends ThongTinSV{

    public ThongTinSVChinhQuy(String heSV, String maSV, String hoTen, LocalDate sinhNhat, int namVaoHoc, int diemDauVao, List<KetQuaHocTap> ketQuaHocTapArrayList) {
        super(heSV, maSV, hoTen, sinhNhat, namVaoHoc, diemDauVao, ketQuaHocTapArrayList);
    }
}