package lybaonghi_23685131;

public class HinhTron {
		
		private double banKinh;
		private Tam t;

		public Tam getT() {
			return t;
		}
		public void setT(Tam t) throws Exception {
			if (t!= null) {
				this.t = t;
			} else {
				throw new Exception ("Loi");
			}
			
		}
		public static final double PI= 3.1416;
		public double getBanKinh() {
			return banKinh;
		}
		public void setBanKinh(double banKinh) throws Exception {
			if (banKinh>0) {
				this.banKinh = banKinh;
			} else {
		throw new Exception ("Loi");
			}
			
		}
		public HinhTron () {}
		public HinhTron(double banKinh, Tam t) {
			this.banKinh = banKinh;
			this.t = t;
		}
		@Override
		public String toString() {
			return "HinhTron [banKinh=" + banKinh + ", t=" + t + "]";
		}
		public double DienTich() {
		return PI* this.banKinh*this.banKinh;

		}
		public double ChuVi () {
			return this.banKinh*2*PI;
		}



			


		}