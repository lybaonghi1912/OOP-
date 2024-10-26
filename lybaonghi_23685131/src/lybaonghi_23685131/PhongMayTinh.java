package lybaonghi_23685131;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;
	// Constructor
	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	// Getter and Setter
	public int getSoMayTinh() {
		return soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	// Kiểm tra đạt chuẩn đủ sáng và diện tích trung bình 1.5 m vuông
	@Override
	public boolean datChuan() {
		return duSang() && (getDienTich() / getSoMayTinh() >= 1.5);
	}
	// ToString
	@Override
	public String toString() {
		String trangThaiDatChuan = datChuan()? "Phòng đạt chuẩn" : "Phòng không đạt chuẩn";
	return super.toString() + String.format("|%10d|%20s|", soMayTinh, trangThaiDatChuan); 
	}
	}
