package Truck;

public class XeOto {
	private String Hangxe;
	private String Tenxe;
	private int Namsanxuat;
	private String Dongco;
	public String getHangxe() {
		return Hangxe;
	}
	public void setHangxe(String hangxe) {
		Hangxe = hangxe;
	}
	public String getTenxe() {
		return Tenxe;
	}
	public void setTenxe(String tenxe) {
		Tenxe = tenxe;
	}
	public int getNamsanxuat() {
		return Namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		if (namsanxuat <=2020) {
			System.out.println(" Năm sản xuất " + namsanxuat + " năm sản xuất không đúng  ");
		}
		this.Namsanxuat = namsanxuat;
		
	}
	public String getDongco() {
		return Dongco;
	}
	public void setDongco(String dongco) {
		Dongco = dongco;
	}
	@Override
	public String toString() {
		return "XeOto [Hangxe=" + Hangxe + ", Tenxe=" + Tenxe + ", Namsanxuat=" + Namsanxuat + ", Dongco=" + Dongco
				+ "]";
	}
	
	
	
	
	
}
