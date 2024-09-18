package stt27_lybaonghi_23685131;

import java.time.LocalDate;

public class TestSach {

	public static void main(String[] args) {
		ListSach ls = new ListSach();
		Sach s1= new SachGiaoKhoa("01234", "Nhi Dong", LocalDate.of(2012,12,12), 20, 500, false);
		ls.themSach(s1);
		Sach s2= new SachThamKhao("12345", "USA", LocalDate.of(2013, 06, 23), 50, 34, "USA");
        ls.themSach(s2);
        
	}
	
}


