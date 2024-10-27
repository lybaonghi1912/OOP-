package phonghoc;

public class Test {
public static void main (String[] args) throws Exception {
	DanhSachQuanLyPhongHoc danhSach = new DanhSachQuanLyPhongHoc();
	PhongHoc phongHoc1 = new PhongMayTinh("PH001", "A", 50, 4, 30);
	PhongHoc phongHoc2 = new PhongMayTinh("PH002", "B", 60, 6, 70);
	
	danhSach.themPhongHoc(phongHoc1);
	danhSach.themPhongHoc(phongHoc2);
	
	System.out.println("Danh sách phòng học:");
	danhSach.inDanhSachPhongHoc();
}
}
