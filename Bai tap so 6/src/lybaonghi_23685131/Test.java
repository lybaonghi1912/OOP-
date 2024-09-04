package lybaonghi_23685131;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Tạo các đối tượng hàng thực phẩm
            Date ngaySanXuat1 = dateFormat.parse("01/09/2023");
            Date ngayHetHan1 = dateFormat.parse("01/12/2023");
            HangThucPham hang1 = new HangThucPham("H001", "Sữa tươi", 15000, ngaySanXuat1, ngayHetHan1);
            
            Date ngaySanXuat2 = dateFormat.parse("01/07/2023");
            Date ngayHetHan2 = dateFormat.parse("01/08/2023");
            HangThucPham hang2 = new HangThucPham("H002", "Bánh mì", 12000, ngaySanXuat2, ngayHetHan2);

            // In thông tin sản phẩm
            System.out.println(hang1);
            System.out.println("-------------------");
            System.out.println(hang2);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
