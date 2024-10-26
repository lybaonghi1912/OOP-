package lybaonghi23685131;

public class HangDienMay extends HangHoa {
private int  thoiGianBaoHanh;
private double congSuat;
public HangDienMay(String maHang) {
	super(maHang);
	this.thoiGianBaoHanh = 0;
	this.congSuat = 0.0;
}
public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, double congSuat) {
	super(maHang, tenHang, donGia, soLuongTon);
	this.thoiGianBaoHanh = thoiGianBaoHanh;
	this.congSuat = congSuat;
}
public int getThoiGianBaoHanh() {
	return thoiGianBaoHanh;
}
public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
	if(thoiGianBaoHanh < 0)
		throw new IllegalArgumentException("thời gian bảo hành > 0");
	this.thoiGianBaoHanh = thoiGianBaoHanh;
}
public double getCongSuat() {
	return congSuat;
}
public void setCongSuat(double congSuat) {
	if (congSuat < 0)
		throw new IllegalArgumentException("công suất phải lớn hơn hoặc bằng 0");
	this.congSuat = congSuat;
}
@Override
public double getTienVAT() {
	return donGia*0.1;
}
@Override
public String danhGia() {
	return soLuongTon <3? "bán được" : "";
}
}
