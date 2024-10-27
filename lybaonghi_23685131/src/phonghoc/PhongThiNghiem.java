package phonghoc;

public class PhongThiNghiem extends PhongHoc{
private boolean coBonRua;
private String chuyenNganh;
public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coBonRua, String chuyenNganh)
		throws Exception {
	super(maPhong, dayNha, dienTich, soBongDen);
	this.coBonRua = coBonRua;
	this.chuyenNganh = chuyenNganh;
}
public boolean isCoBonRua() {
	return coBonRua;
}
public void setCoBonRua(boolean coBonRua) {
	this.coBonRua = coBonRua;
}
public String getChuyenNganh() {
	return chuyenNganh;
}
public void setChuyenNganh(String chuyenNganh) {
	this.chuyenNganh = chuyenNganh;
}
@Override
public boolean datChuan() {
	return duSang() && coBonRua;
}
@Override
public String toString() {
	String trangThaiDatChuan = datChuan()? "đạt chuẩn" : "không đạt chuẩn";
String trangThaiBonRua = coBonRua? "có" : "không";
return super.toString() + String.format("|%20s|%15s|%20s|", trangThaiBonRua, trangThaiDatChuan);
}
}
