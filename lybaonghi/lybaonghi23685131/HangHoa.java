package lybaonghi23685131;
import java.text.DecimalFormat;

public abstract class HangHoa {
protected final String maHang;
protected String tenHang;
protected double donGia;
protected int soLuongTon;

public String getTenHang() {
	return tenHang;
}
public void setTenHang(String tenHang) {
	if (maHang==null || maHang.trim().length() ==0)
		throw new IllegalArgumentException("mã hàng không được để trống");
	this.tenHang = tenHang;
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	if (donGia < 0)
		throw new IllegalArgumentException("đơn giá phải lớn hơn hoặc bằng 0");
	this.donGia = donGia;
}
public int getSoLuongTon() {
	return soLuongTon;
}
public void setSoLuongTon(int soLuongTon) {
	if (soLuongTon < 0)
		throw new IllegalArgumentException("số lượng tồn phải lớn hơn hoặc bằng 0");
	this.soLuongTon = soLuongTon;
}
public String getMaHang() {
	return maHang;
}
public HangHoa(String maHang) {
	this (maHang, "xxx", 0.0,0);
	
}
public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
	if (maHang==null || maHang.trim().length()==0)
		throw new IllegalArgumentException("mã hàng không được để trống");
	this.maHang = maHang;
	this.tenHang = tenHang;
	this.donGia = donGia;
	this.soLuongTon = soLuongTon;
}
public abstract double getTienVAT();
public abstract String danhGia();
@Override
public String toString() {
	DecimalFormat df = new DecimalFormat("#, ##0.#");
	return String.format("%-10s %-20s %-10s %-10d %-10s %-10s", maHang, tenHang, df.format(donGia), soLuongTon, df.format(getTienVAT()), danhGia());
}
}

