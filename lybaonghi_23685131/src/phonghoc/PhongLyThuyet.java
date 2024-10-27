package phonghoc;

public class PhongLyThuyet extends PhongHoc {
private boolean mayChieu;

public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) throws Exception {
	super(maPhong, dayNha, dienTich, soBongDen);
	this.mayChieu = mayChieu;
}
public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
	super(maPhong, dayNha, dienTich, soBongDen);
}
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
String trangThaiDatChuan = datChuan()? "đạt chuẩn" : "không đạt chuẩn";
String trangThaiMayChieu = isMayChieu()? "có máy chiếu" : "không có máy chiếu";
return super.toString() + String.format("|%20s|%15s", trangThaiDatChuan, trangThaiMayChieu);
}

}
