package Bai02;

public class ThuocTinhSach {
    protected String maTaiLieu, nhaXuatBan, soPhatHanh;

    public ThuocTinhSach(String maTaiLieu, String nhaXuatBan, String soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }




    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "ThuocTinhSach{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh='" + soPhatHanh + '\'' +
                '}';
    }
}
