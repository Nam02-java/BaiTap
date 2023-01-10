package Bai02;

public class Bao extends ThuocTinhSach {
    private String ngayPhatHanh;


    public Bao(String maTaiLieu, String nhaXuatBan, String soPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }



    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }


    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh='" + soPhatHanh + '\'' +
                '}';
    }
}
