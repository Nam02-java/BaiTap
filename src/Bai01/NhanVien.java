package Bai01;
public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, String tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
}
