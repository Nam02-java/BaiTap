package Bai12;

public class XeMay extends PTGT {
    private int congXuat;

    public XeMay(String id, String hangSX, String namSx, int giaBan, String mauXe, int congXuat) {
        super(id, hangSX, namSx, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(int congXuat) {
        this.congXuat = congXuat;
    }
}