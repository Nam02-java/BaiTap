package Bai12;

public class XeTai extends PTGT{
    private int trongTai;

    public XeTai(String id, String hangSX, String namSx, int giaBan, String mauXe, int trongTai) {
        super(id, hangSX, namSx, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}