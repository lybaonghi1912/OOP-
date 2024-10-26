package lybaonghi_23685131;

public class PhongThiNghiem extends PhongHoc {
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
		String trangThaiDatChuan = datChuan()? "Phòng đạt chuẩn" : "Phòng không đạt chuẩn";
	String trangThaiBonRua = coBonRua? "Có bồn rửa" : "Không có bồn rửa";
	return super.toString() + String.format("|%20s|%15s|%20s|", trangThaiBonRua, trangThaiDatChuan);
}
}