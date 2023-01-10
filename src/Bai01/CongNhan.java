package Bai01;

public class CongNhan extends CanBo {
    private String bacEXP;

    public CongNhan(String hoTen, String tuoi, String gioiTinh, String diaChi, String bacEXP) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bacEXP = bacEXP;
    }
}
