package lybaonghi_23685131;
import java.util.ArrayList;
public class QuanLyDanhSachPhongHoc {
private ArrayList<PhongHoc>danhSachPhongHoc;

public QuanLyDanhSachPhongHoc() {
	this.danhSachPhongHoc = new ArrayList<>();
}
public boolean themPhongHoc(PhongHoc phongHoc) {
    // Kiểm tra xem mã phòng có trùng không
    if (!danhSachPhongHoc.contains(phongHoc)) {
        danhSachPhongHoc.add(phongHoc);
        return true;
    }
    return false;
}
public PhongHoc timKiem(String maPhong) {
	for (PhongHoc phong : danhSachPhongHoc) {
		if (phong.getMaPhong().equals(maPhong)) {
			return phong;
		}
	}
	return null;
}
public void intDanhSachPhongHoc() {
	for (PhongHoc phong : danhSachPhongHoc) {
		System.out.println(phong);
	}
}
public void intDanhSachPhongDatChuan() {
	for (PhongHoc phong : danhSachPhongHoc) {
		if (phong.datChuan()) {
			System.out.println(phong);
		}
	}
}
public void sapXepTheoDayNha() {
	danhSachPhongHoc.sort((p1, p2) -> p1.getDayNha().compareTo(p2.getDayNha()));
}
public void sapXepTheoDienTichGiamDan() {
	danhSachPhongHoc.sort((p1, p2) -> Double.compare(p2.getDienTich(), p1.getDienTich()));
}
public void sapXepTheoSoBongDen() {
	danhSachPhongHoc.sort((p1, p2) -> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
}
public int tongSoBongDen() {
	return danhSachPhongHoc.size();
}
public void inDanhSachPhongMayCo60May() {
	for (PhongHoc phong : danhSachPhongHoc) {
		if(phong instanceof PhongMayTinh) {
			PhongMayTinh phongMayTinh = (PhongMayTinh) phong;
			if (phongMayTinh.getSoMayTinh() >= 60) {
				System.out.println(phongMayTinh);
			}
		}
	}
}
}