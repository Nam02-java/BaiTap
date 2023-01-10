package Bai15.CRUD;

import Bai15.DuLieu.*;

import java.time.LocalDate;
import java.util.*;

public class XuLyPhuongThuc extends TatCaPhuongThuc {
    private static ArrayList<ThongTinSV> thongTinSVArrayList = new ArrayList<>();
    private static List<KetQuaHocTap> ketQuaHocTapArrayList = new ArrayList<>();
    private static ArrayList<KhoaKinhTe> khoaKinhTeArrayList = new ArrayList<>();
    private static ArrayList<KhoaCNTT> khoaCNTTArrayList = new ArrayList<>();
    private static ArrayList<Khoa> khoaArrayList = new ArrayList<>();
    private final String heSVChinhQuy = "chinh quy";
    private final String heSVTaiChuc = "tai chuc";
    private final String TenKhoaCNTT = "khoa CNTT";
    private final String TenKhoaKinhTe = "khoa Kinh Te";


    private static int index_certificateArrayList;

    @Override
    public void themSV() {

        System.out.println("ma sv : ");
        String maSV = new Scanner(System.in).nextLine();
        System.out.println("ho ten : ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("ngay sinh : ");
        int ngaySinh = new Scanner(System.in).nextInt();
        System.out.println("thang sinh : ");
        int thangSinh = new Scanner(System.in).nextInt();
        System.out.println("nam sinh : ");
        int namSinh = new Scanner(System.in).nextInt();
        LocalDate localDate = LocalDate.of(namSinh, thangSinh, ngaySinh);
        System.out.println("nam vao hoc : ");
        int namVaoHoc = new Scanner(System.in).nextInt();
        System.out.println("diem dau vao : ");
        int diemDauVao = new Scanner(System.in).nextInt();
        System.out.println("ten hoc ki : ");
        String tenHK = new Scanner(System.in).nextLine();
        System.out.println("diem TBHK : ");
        int diemTBHK = new Scanner(System.in).nextInt();
        ketQuaHocTapArrayList.add(new KetQuaHocTap(tenHK, diemTBHK));
        System.out.println("1.sv chinh quy  2.sv tai chuc");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                index_certificateArrayList = ketQuaHocTapArrayList.size() - 1;
                ThongTinSV thongTinSV_chinhQuy = new ThongTinSVChinhQuy(heSVChinhQuy, maSV, hoTen, localDate, namVaoHoc, diemDauVao, Collections.singletonList(ketQuaHocTapArrayList.get(index_certificateArrayList)));
                thongTinSVArrayList.add(thongTinSV_chinhQuy);
                break;
            case "2":
                System.out.println("noi lien ket ");
                String noiLK = new Scanner(System.in).nextLine();
                index_certificateArrayList = ketQuaHocTapArrayList.size() - 1;
                ThongTinSV thongTinSV_taiChuc = new ThongTinSVTaiChuc(heSVTaiChuc, maSV, hoTen, localDate, namVaoHoc, diemDauVao, Collections.singletonList(ketQuaHocTapArrayList.get(index_certificateArrayList)), noiLK);
                thongTinSVArrayList.add(thongTinSV_taiChuc);
                break;
            default:
                System.out.println("sai lua chon");
                break;
        }
        System.out.println("1.khoa cntt   2.khoa kt");
        choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                Khoa khoaCNTT = new KhoaCNTT(TenKhoaCNTT, Collections.singletonList(thongTinSVArrayList.get(index_certificateArrayList)));
                khoaArrayList.add(khoaCNTT);
                break;
            case "2":
                Khoa khoaKinhTe = new KhoaKinhTe(TenKhoaKinhTe, Collections.singletonList(thongTinSVArrayList.get(index_certificateArrayList)));
                khoaArrayList.add(khoaKinhTe);
                break;
            default:
                System.out.println("sai lua chon");
                break;
        }

    }

    @Override
    public void tatCaThongTinSV() {
        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            System.out.println(thongTinSVArrayList);
        }
    }

    @Override
    public void xacDinhHeSV(String maSV) {

        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            if (thongTinSVArrayList.get(i).getMaSV().equalsIgnoreCase(maSV)) {
                if (thongTinSVArrayList.get(i).getHeSV().equalsIgnoreCase(heSVChinhQuy)) {
                    System.out.println("sv ma : " + maSV + " la sinh vien " + heSVChinhQuy);
                } else {
                    System.out.println("sv ma : " + maSV + " la sinh vien " + heSVTaiChuc);
                }
            }
        }
    }

    @Override
    public void diemTBHK(String tenHK) {
        for (int i = 0; i < ketQuaHocTapArrayList.size(); i++) {
            if (ketQuaHocTapArrayList.get(i).getTenHocKy().equalsIgnoreCase(tenHK)) {
                System.out.println("diem TBHK cua tat ca sv : " + ketQuaHocTapArrayList.get(i).getDiemTBHK());
            }
        }
    }

    @Override
    public void tongSoSVChinhQuyCuaKhoa() {
        System.out.println("1.khoaCNTT  2.khoaKinhTe");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                System.out.println("tong so sv khoa cntt : " + khoaCNTTArrayList.size());
                break;
            case "2":
                System.out.println("tong so sv khoa kinh te : " + khoaKinhTeArrayList.size());
                break;
            default:
                System.out.println("sai lua chon");
                break;
        }
    }

    @Override
    public void svDiemDauVaoCaoNhatKhoa() {
        System.out.println("1.khoaCNTT  2.khoaKinhTe");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                for (int i = 0; i < khoaCNTTArrayList.size(); i++) {
                    int finalI = i;
                    Collections.sort(khoaCNTTArrayList, new Comparator<KhoaCNTT>() {
                        @Override
                        public int compare(KhoaCNTT o1, KhoaCNTT o2) {
                            return o1.getThongTinSVArrayList().get(finalI).getDiemDauVao() - o2.getThongTinSVArrayList().get(finalI + 1).getDiemDauVao();
                        }
                    });
                    System.out.println("sv co diem dau vao cao nhat khoa CNTT : " + khoaCNTTArrayList.get(khoaCNTTArrayList.size() - 1));
                }
                break;
            case "2":
                for (int i = 0; i < khoaKinhTeArrayList.size(); i++) {
                    int finalI = i;
                    Collections.sort(khoaKinhTeArrayList, new Comparator<KhoaKinhTe>() {
                        @Override
                        public int compare(KhoaKinhTe o1, KhoaKinhTe o2) {
                            return o1.getThongTinSVArrayList().get(finalI).getDiemDauVao() - o2.getThongTinSVArrayList().get(finalI + 1).getDiemDauVao();
                        }
                    });
                    System.out.println("sv co diem dau vao cao nhat khoa kinh te : " + khoaKinhTeArrayList.get(khoaKinhTeArrayList.size() - 1));
                }
                break;
            default:
                System.out.println("sai lua chon");
                break;
        }
    }

    @Override
    public void timSVtaiChucTheo_noiLienKet(String noiLK) {
        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            if (thongTinSVArrayList.get(i) instanceof ThongTinSVTaiChuc) {
                if (((ThongTinSVTaiChuc) thongTinSVArrayList.get(i)).getNoiLienKet().equalsIgnoreCase(noiLK)) {
                    System.out.println(thongTinSVArrayList.get(i));
                }
            }
        }
    }

    @Override
    public void timSVdatDiemTBTheoHKganNhat() {
        int diemTieuChuan = 8;
        Collections.sort(ketQuaHocTapArrayList, new Comparator<KetQuaHocTap>() {
            @Override
            public int compare(KetQuaHocTap o1, KetQuaHocTap o2) {
                if (o1.getTenHocKy().compareTo(o2.getTenHocKy()) > 0) {
                    return 1;
                } else if (o1.getTenHocKy().compareTo(o2.getTenHocKy()) < 0) {
                    return -1;
                } else {
                    if (o1.getDiemTBHK() - o2.getDiemTBHK() > 0) {
                        return 1;
                    } else if (o1.getDiemTBHK() - o2.getDiemTBHK() < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        String HKganNhat = thongTinSVArrayList.get(0).getKetQuaHocTapArrayList().get(0).getTenHocKy();
        System.out.println("cac sv khoa cntt dat chuan diem hk gan nhat ");
        for (int i = 0; i < khoaArrayList.size(); i++) {
            if (khoaArrayList.get(i).getTenKhoa().equalsIgnoreCase(TenKhoaCNTT)) {
                if (khoaArrayList.get(i).getThongTinSVArrayList().get(i).getKetQuaHocTapArrayList().get(i).getTenHocKy().equalsIgnoreCase(HKganNhat)) {
                    if (khoaArrayList.get(i).getThongTinSVArrayList().get(i).getKetQuaHocTapArrayList().get(i).getDiemTBHK() >= diemTieuChuan) {
                        System.out.println(khoaArrayList.get(i).getThongTinSVArrayList().get(i));
                    }
                }
            }
        }
        System.out.println("cac sv khoa kinh te dat chuan diem hk gan nhat ");
        for (int i = 0; i < khoaArrayList.size(); i++) {
            if (khoaArrayList.get(i).getTenKhoa().equalsIgnoreCase(TenKhoaKinhTe)) {
                if (khoaArrayList.get(i).getThongTinSVArrayList().get(i).getKetQuaHocTapArrayList().get(i).getTenHocKy().equalsIgnoreCase(HKganNhat)) {
                    if (khoaArrayList.get(i).getThongTinSVArrayList().get(i).getKetQuaHocTapArrayList().get(i).getDiemTBHK() >= diemTieuChuan) {
                        System.out.println(khoaArrayList.get(i).getThongTinSVArrayList().get(i));
                    }
                }
            }
        }
    }

    @Override
    public void timSVdiemHKcaoNhat(String HK) {

        Collections.sort(ketQuaHocTapArrayList, new Comparator<KetQuaHocTap>() {
            @Override
            public int compare(KetQuaHocTap o1, KetQuaHocTap o2) {
                if (o1.getDiemTBHK() - o2.getDiemTBHK() > 0) {
                    return 1;
                } else if (o1.getDiemTBHK() - o2.getDiemTBHK() < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sinh vien khoa cntt diem cao nhat trong HK " + HK + " co so diem la : " +
                khoaCNTTArrayList.get(0).getThongTinSVArrayList().get(0));
        System.out.println("\n" + "Sinh vien khoa kinh te diem cao nhat trong HK " + HK + " co so diem la : " +
                khoaKinhTeArrayList.get(0).getThongTinSVArrayList().get(0));
    }

    @Override
    public void sortSVtangDanTheoLoai_giamDanTheoNam() {
        Collections.sort(thongTinSVArrayList, new Comparator<ThongTinSV>() {
            @Override
            public int compare(ThongTinSV o1, ThongTinSV o2) {
                if (o1.getHeSV().compareTo(o2.getHeSV()) > 0) {
                    return -1;
                } else if (o1.getHeSV().compareTo(o2.getHeSV()) < 0) {
                    return 1;
                } else {
                    if (o1.getNamVaoHoc() - o2.getNamVaoHoc() > 0) {
                        return -1;
                    } else if (o1.getNamVaoHoc() - o2.getNamVaoHoc() < 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("sau khi sort theo yeu cau : ");
        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            System.out.println(thongTinSVArrayList.get(i));
        }
    }

    @Override
    public void thongKeLuongSVtheoNamHoc() {
        int count = 0;
        int finalJ = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            if (arrayList.contains(thongTinSVArrayList.get(i).getNamVaoHoc())) {
                arrayList.add(thongTinSVArrayList.get(i).getNamVaoHoc());
            }
        }
        for (int i = 0; i < thongTinSVArrayList.size(); i++) {
            for (int j = i + 1; j < thongTinSVArrayList.size(); j++) {
                if (thongTinSVArrayList.get(j).getNamVaoHoc() == arrayList.get(j)) {
                    count += 1;
                    finalJ = j;
                }
            }
            System.out.println("nam hoc : " + thongTinSVArrayList.get(finalJ).getNamVaoHoc() + " co tong so sinh vien la : " + count);
        }
    }
}
