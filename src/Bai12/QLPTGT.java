package Bai12;

import java.util.ArrayList;

public class QLPTGT {
    static ArrayList<PTGT> arrayList = new ArrayList<>();

    public static void themXe(PTGT ptgt) {
        arrayList.add(ptgt);
    }

    public static void filter() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void xoaTheoID(String id) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId().equals(id)) {
                arrayList.remove(i);
            }
        }
    }

    public static void timTheoHangSX(String hangSX) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getHangSX().equals(hangSX)) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    public static void timTheoMau(String mauXe) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMauXe().equals(mauXe)) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}