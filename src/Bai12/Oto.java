package Bai12;

public class  Oto extends PTGT {

    private int soChoNgoi;
    private String kieuDongCo;

    public Oto(String id, String hangSX, String namSx, int giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSX, namSx, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
}