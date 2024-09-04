package lybaonghi_23685131;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    // Constructor đầy đủ tham số
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySanXuat, Date ngayHetHan) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng.");
        }
        this.maHang = maHang;
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    // Constructor chỉ có mã hàng
    public HangThucPham(String maHang) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng.");
        }
        this.maHang = maHang;
    }

    // Getters and Setters
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.isEmpty()) {
            this.tenHang = "Không xác định";
        } else {
            this.tenHang = tenHang;
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            this.donGia = 1000;  // Gán giá trị mặc định nếu đơn giá <= 0
        } else {
            this.donGia = donGia;
        }
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if (ngaySanXuat == null) {
            this.ngaySanXuat = new Date();  // Gán ngày hiện tại nếu ngày sản xuất rỗng
        } else {
            this.ngaySanXuat = ngaySanXuat;
        }
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        if (ngayHetHan == null || ngayHetHan.before(ngaySanXuat)) {
            // Nếu ngày hết hạn rỗng hoặc trước ngày sản xuất thì gán giá trị mặc định
            this.ngayHetHan = new Date(this.ngaySanXuat.getTime() + 86400000L); // 1 ngày sau ngày sản xuất
        } else {
            this.ngayHetHan = ngayHetHan;
        }
    }

    // Phương thức kiểm tra hàng thực phẩm đã hết hạn chưa
    public boolean isHetHan() {
        Date now = new Date();
        return ngayHetHan.before(now);
    }

    // Phương thức toString định dạng dữ liệu
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        
        return "Mã hàng: " + maHang + "\n" +
               "Tên hàng: " + tenHang + "\n" +
               "Đơn giá: " + decimalFormat.format(donGia) + " VND\n" +
               "Ngày sản xuất: " + dateFormat.format(ngaySanXuat) + "\n" +
               "Ngày hết hạn: " + dateFormat.format(ngayHetHan) + "\n" +
               "Tình trạng: " + (isHetHan() ? "Hết hạn" : "Còn hạn");
    }
}

