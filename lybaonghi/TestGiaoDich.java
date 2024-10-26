package lybaonghi;
import java.util.Date;
import java.util.Locale;
import java.text.NumberFormat;
public class TestGiaoDich {
 public static int tinhTongSoLuongGD(GiaoDich[] listGiaoDich) {
	 int countSL = 0; 
	 for (GiaoDich gd: listGiaoDich) {
		 countSL += gd.getSoLuong();
	 }
	 return countSL;
 }
 public static double tinhTrungBinhThanhTien(GiaoDich[] listGiaoDich) {
	 double sum = 0;
	 for (GiaoDich gd: listGiaoDich) {
		 sum += gd.getThanhTien();
	 }
	 return sum / listGiaoDich.length;
 }
 public static void xuatGiaoDich(GiaoDich[] listGiaoDich) {
	 for (GiaoDich gd: listGiaoDich) {
		 if (gd.getDonGia() > 1000000000) {
			 System.out.println(gd);
	}
	 }
	}
	 public static void main(String[] args) {
		 Locale locale = new Locale ("vi", "VN");
		 NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		 
		 GiaoDichVang[] gdVang = { new GiaoDichVang(1, new Date(), 5000, 3, "SCJ"), new GiaoDichVang(2, new Date(), 2500, 4, "SCJ"), new GiaoDichVang(3, new Date(), 1000, 5, "9999") };
	GiaoDichTienTe[] gdTienTe = { new GiaoDichTienTe(4, new Date(), 1500000000, 3, 1, "VND"), new GiaoDichTienTe(5, new Date(), 500, 2, 23000, "USD"), new GiaoDichTienTe(6, new Date(), 7000, 6, 23000, "EUR") };
	System.out.println("Tổng số lượng giao dịch vàng: " + tinhTongSoLuongGD(gdVang));
	 System.out.println("Tổng số lượng giao dịch tiền tệ: " + tinhTongSoLuongGD(gdTienTe));
	 System.out.println("Thành tiền trung bình của giao dịch tiền tệ: " + nf.format(tinhTrungBinhThanhTien(gdTienTe)));
	 System.out.println();
	 System.out.println("Các giao dịch có đơn giá hơn 1 tỷ: ");
	 xuatGiaoDich(gdTienTe);
	 xuatGiaoDich(gdVang);
	 }
 }
