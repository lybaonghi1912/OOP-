package stt27_lybaonghi_23685131;

import java.util.ArrayList;
import java.util.List;

public class ListSach {
List<Sach> ls;
public ListSach() {
	ls= new ArrayList<Sach>(2);
}
public boolean themSach(Sach s) {
	if (ls.contains(s)==true) {
		return false;
	} else return ls.add(s);
	
}
public void inKQ() {
	for(Sach sach : ls) {
		if(sach!=null) {
			System.out.println(sach);
		}
	}
}
}
