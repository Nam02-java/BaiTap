package Bai03;

public class Khoi extends ThongTin {

    private String khoi;

    public Khoi(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, String khoi) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.khoi = khoi;
    }


    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    @Override
    public String toString() {
        return "{" +
                " soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                " khoi= " + khoi + " }";
    }
}
