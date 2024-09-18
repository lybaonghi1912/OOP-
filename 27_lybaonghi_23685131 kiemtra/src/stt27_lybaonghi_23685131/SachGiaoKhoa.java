package stt27_lybaonghi_23685131;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang; 

    public SachGiaoKhoa(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong, boolean tinhTrang) {
        super(maSach, nhaXB, ngayNhap, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    public SachGiaoKhoa() {
        super();
    }

    @Override
    public double getThanhTien() {
        if (tinhTrang) { 
            return getDonGia() * getSoLuong();
        } else { 
            return getDonGia() * getSoLuong() / 2;
        }
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTrangSachChuoi() {
        return tinhTrang ? "Mới" : "Cũ";
    }

    @Override
    public String toString() {
        String s1 = String.format("|%10s|%10.2f|", getTrangSachChuoi(), getThanhTien());
        return super.toString() + s1;
    }
}
