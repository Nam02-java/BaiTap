package Bai15.CRUD;

public abstract class TatCaPhuongThuc {
    public abstract void themSV();

    public abstract void tatCaThongTinSV();

    public abstract void xacDinhHeSV(String maSV);

    public abstract void diemTBHK(String tenHK);

    public abstract void tongSoSVChinhQuyCuaKhoa();
    public abstract void svDiemDauVaoCaoNhatKhoa();

    public abstract void timSVtaiChucTheo_noiLienKet(String noiLK);
    public abstract void timSVdatDiemTBTheoHKganNhat();
    public abstract void timSVdiemHKcaoNhat(String HK);

    public abstract void sortSVtangDanTheoLoai_giamDanTheoNam();
    public abstract void thongKeLuongSVtheoNamHoc();
}