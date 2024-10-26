package lybaonghi_23685131;

public class PhongLyThuyet extends PhongHoc {
	private boolean mayChieu;
// Constructor
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.mayChieu = mayChieu; }
// Constructor không có máy chiếu
public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
	super(maPhong, dayNha, dienTich, soBongDen);
}
// Getter and Setter 
public boolean isMayChieu() {
	return mayChieu;
}
public void setMayChieu(boolean mayChieu) {
	this.mayChieu = mayChieu;
}
@Override
public boolean datChuan() {
	return isMayChieu() && duSang();
}
@Override
public String toString() {
String trangThaiDatChuan = datChuan()? "Phòng đạt chuẩn" : "Phòng không đạt chuẩn";
String trangThaiMayChieu = isMayChieu()? "Có máy chiếu" : "Không có máy chiếu";
return super.toString() + String.format("|%20s|%15s|", trangThaiDatChuan, trangThaiMayChieu);
}
}
