package Bai03;

public class KhoiA extends ThongTin{
    private String Toan , Ly , Hoa;

    public KhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, String choose) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public String getToan() {
        return Toan;
    }

    public void setToan(String toan) {
        Toan = toan;
    }

    public String getLy() {
        return Ly;
    }

    public void setLy(String ly) {
        Ly = ly;
    }

    public String getHoa() {
        return Hoa;
    }

    public void setHoa(String hoa) {
        Hoa = hoa;
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "Toan='" + Toan + '\'' +
                ", Ly='" + Ly + '\'' +
                ", Hoa='" + Hoa + '\'' +
                ", soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                '}';
    }
}
