package giaodich;
import java.util.Date;
public class GiaoDichTienTe extends GiaoDich {
private double tiGia;
private String loaiTienTe;

public GiaoDichTienTe(int maGiaoDich, Date ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTienTe) {
	super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
	this.tiGia = tiGia;
	this.loaiTienTe = loaiTienTe;
}

public final double getTiGia() {
	return tiGia;
}

public final void setTiGia(double tiGia) {
	this.tiGia = tiGia;
}

public final String getLoaiTienTe() {
	return loaiTienTe;
}

public final void setLoaiTienTe(String loaiTienTe) {
	this.loaiTienTe = loaiTienTe;
}

@Override
public double getThanhTien() {
	if (this.loaiTienTe.compareTo("USD") == 0 || this.loaiTienTe.compareTo("EUR") ==0 ) {
		return this.getSoLuong()*this.getDonGia();
	} else {
		return 0;
	}
}

@Override
public String toString() {
	return "GiaoDichTienTe [tiGia=" + tiGia + ", loaiTienTe=" + loaiTienTe + "]";
}

}
