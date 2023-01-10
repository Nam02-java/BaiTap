package Bai02;

public class TapChi extends ThuocTinhSach{
    private String soPhatHanh , thangPhatHanh;

    public TapChi(String maTaiLieu, String nhaXuatBan, String soPhatHanh, String phatHanh, String thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soPhatHanh);
    }

    @Override
    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    @Override
    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
