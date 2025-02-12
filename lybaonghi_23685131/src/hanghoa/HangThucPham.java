package hanghoa;
import java.time.LocalDate;
public class HangThucPham extends HangHoa{
private String nhaCungCap;
private LocalDate ngaySanXuat;
private LocalDate ngayHetHan;
public HangThucPham(String maHang) {
	super(maHang);
	this.nhaCungCap = "";
	this.ngaySanXuat = LocalDate.now();
	this.ngayHetHan = ngaySanXuat;
}
public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
	super(maHang, tenHang, donGia, soLuongTon);
	this.nhaCungCap = nhaCungCap;
	this.ngaySanXuat = ngaySanXuat;
	this.ngayHetHan = ngayHetHan;
}
public String getNhaCungCap() {
	return nhaCungCap;
}
public void setNhaCungCap(String nhaCungCap) {
	this.nhaCungCap = nhaCungCap;
}
public LocalDate getNgaySanXuat() {
	return ngaySanXuat;
}
public void setNgaySanXuat(LocalDate ngaySanXuat) {
	if(ngaySanXuat.isAfter(LocalDate.now()))
		throw new IllegalArgumentException("ngày sản xuất phải trước ngày hiện tại");
	this.ngaySanXuat = ngaySanXuat;
}
public LocalDate getNgayHetHan() {
	return ngayHetHan;
}
public void setNgayHetHan(LocalDate ngayHetHan) {
	if(ngayHetHan.isBefore(ngaySanXuat))
		throw new IllegalArgumentException("ngày hết hạn phải sau ngày sản xuất");
	this.ngayHetHan = ngayHetHan;
}
@Override
public double getTienVAT() {
	return donGia*0.5;
}
@Override
public String danhGia() {
LocalDate now = LocalDate.now();
	return (soLuongTon > 0 && ngayHetHan.isBefore(now)) ? " kho ban" : "";
}


}
