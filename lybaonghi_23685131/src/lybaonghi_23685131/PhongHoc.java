package lybaonghi_23685131;
import java.util.Objects;
public abstract class PhongHoc {
public abstract boolean datChuan();
protected String maPhong, dayNha;
protected double dienTich;
protected int soBongDen;

public String getMaPhong() {
	return maPhong;
}
public void setMaPhong(String maPhong) {
	this.maPhong = maPhong;
}
public String getDayNha() {
	return dayNha;
}
public void setDayNha(String dayNha) {
	this.dayNha = dayNha;
}
public double getDienTich() {
	return dienTich;
}
public void setDienTich(double dienTich) {
	this.dienTich = dienTich;
}
public int getSoBongDen() {
	return soBongDen;
}
public void setSoBongDen(int so) throws Exception {
	if(so > 0) {
	this.soBongDen = so;
} else {
	throw new Exception ("Số bóng đèn phải lớn hơn 0");
}
}
public PhongHoc(String maPhong, String dayNha, double dienTich, int so) throws Exception {
	this.maPhong = maPhong;
	this.dayNha = dayNha;
	this.dienTich = dienTich;
	if(so > 0) {
	this.soBongDen = so;
} else {
	throw new Exception("Số bóng đèn phải lớn hơn 0");
}
}
public boolean duSang() {
	return getDienTich() / getSoBongDen() <= 10;
}
@Override
public String toString() {
	String duSang = duSang()? "Đủ ánh sáng": "Không đủ ánh sáng";
	return String.format("|%10s|%10s|%10.2f|%10d|%20s",getMaPhong(), getDayNha(), getDienTich(), getSoBongDen(), duSang);
}
@Override
public int hashCode() {
	return Objects.hash(maPhong);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PhongHoc other = (PhongHoc) obj;
	return Objects.equals(maPhong, other.maPhong);
}

}
