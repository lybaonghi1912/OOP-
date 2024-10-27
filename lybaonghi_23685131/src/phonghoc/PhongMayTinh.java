package phonghoc;

public class PhongMayTinh extends PhongHoc{
private int soMayTinh;

public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) throws Exception {
	super(maPhong, dayNha, dienTich, soBongDen);
	this.soMayTinh = soMayTinh;
}

public int getSoMayTinh() {
	return soMayTinh;
}

public void setSoMayTinh(int soMayTinh) {
	this.soMayTinh = soMayTinh;
}

@Override
public boolean datChuan() {
	return duSang() && (getDienTich() / getSoMayTinh() >= 1.5);
}

@Override
public String toString() {
	String trangThaiDatChuan = datChuan()? "đạt chuẩn" : "không đạt chuẩn";
	return super.toString()+ String.format("|%10d|%20s|", soMayTinh, trangThaiDatChuan);
}

}
