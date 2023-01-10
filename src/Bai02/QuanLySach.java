package Bai02;

import java.util.ArrayList;

public class QuanLySach {
    public static ArrayList<ThuocTinhSach> arrayList = new ArrayList<>();


    public void themMoiTaiLieu(ThuocTinhSach thuocTinhSach) {
        this.arrayList.add(thuocTinhSach);
    }

    public void xoaTaiLieu(int maTaiLieu) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMaTaiLieu().equals(maTaiLieu)) {
                arrayList.remove(i);
            }
        }
    }

    public void hienThiTatCa(){
        for (int i =0 ;  i < arrayList.size() ; i++){
            System.out.println(arrayList.get(i));
        }
    }

    public void timSach() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Sach) {
                System.out.println(arrayList.get(i));
            } else {
                System.out.println(arrayList.get(i)+" ten tac gia " + ((Sach) arrayList.get(i)).getTenTacGia() + " so trang " + ((Sach) arrayList.get(i)).getTenTacGia());
            }
        }
    }

    public void timTapChi() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TapChi) {
                System.out.println(arrayList.get(i)+" so phat hanh " + ((TapChi) arrayList.get(i)).getSoPhatHanh() + " thang phat hanh " + ((TapChi) arrayList.get(i)).getThangPhatHanh());

            } else {
                System.out.println("tai lieu trong");
            }
        }
    }

    public void timBao() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Bao) {
                System.out.println(arrayList.get(i)+" ngay phat hanh " + ((Bao) arrayList.get(i)).getNgayPhatHanh());
            } else {
                System.out.println("tai lieu trong");
            }
        }
    }
}
