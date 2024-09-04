package lybaonghi_23685131;

public class Mainkiemtra {
	    public static void main(String[] args) {
	        Rational p1 = new Rational(2, 3);
	        Rational p2 = new Rational(3, 4);

	        // Cộng hai phân số
	        Rational p3 = p1.add(p2);
	        System.out.println("Cộng hai phân số: " + p3);  // 17/12

	        // Tối giản phân số
	        Rational p4 = new Rational(4, 8);
	        System.out.println("Tối giản phân số: " + p4);  // 1/2

	        // Nghịch đảo phân số
	        Rational p5 = p1.reciprocal();
	        System.out.println("Nghịch đảo phân số: " + p5);  // 3/2

	        // So sánh hai phân số
	        System.out.println("Hai phân số bằng nhau? " + p1.equals(p2, 0.0001));  // False
	    }
	}

