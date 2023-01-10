package Bai12;

public class PTGT {
    private String id;
    private String hangSX, namSx;
    private int giaBan;
    private String mauXe;

    public PTGT(String id, String hangSX, String namSx, int giaBan, String mauXe) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSx = namSx;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNamSx() {
        return namSx;
    }

    public void setNamSx(String namSx) {
        this.namSx = namSx;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    @Override
    public String toString() {
        return "PTGT{" +
                "id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSx='" + namSx + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}
