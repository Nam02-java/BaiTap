package Bai02;

public class Sach extends ThuocTinhSach {
    private String tenTacGia, soTrang;


    public Sach(String maTaiLieu, String nhaXuatBan, String soPhatHanh, String tenTacGia, String soTrang) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }
}
