package Truck;

public class XeBus {
	private String tenxe;
	private int soxe;
	private String biensoxe;
	private int soghe;
	private int namsanxuat;
	
	
	public int getNamsanxuat() {
		return namsanxuat;
	}
	public void setNamsanxuat(int namsanxuat) {
		if (namsanxuat <=2015) {
			System.out.println(" Năm sản xuất " + namsanxuat + " không có loại xe này ");
		}
		this.namsanxuat = namsanxuat;
	}
	public int getSoghe() {
		return soghe;
	}
	public void setSoghe(int soghe) {
		if (soghe <= 10) {
			System.out.println(" Số ghế " + soghe + " không có ghế");
			} else {
				this.soghe = soghe;
			}
		this.soghe = soghe;
	}
	public String getTenxe() {
		return tenxe;
	}
	public void setTenxe(String tenxe) {
		this.tenxe = tenxe;
	}
	public int getSoxe() {
		return soxe;
	}
	public void setSoxe(int soxe) {
		if (soxe >=30) {
			System.out.println(" Số xe " + soxe + " không có chuyến xe này ");
		} else {
			this.soxe = soxe;
			{
		this.soxe = soxe;
			}
		}
	}

	public String getBiensoxe() {
		return biensoxe;
	}
	public void setBiensoxe(String biensoxe) {
		this.biensoxe = biensoxe;
	}
	@Override
	public String toString() {
		return "XeBus [tenxe=" + tenxe + ", soxe=" + soxe + ", biensoxe=" + biensoxe + ", soghe=" + soghe
				+ ", namsanxuat=" + namsanxuat + "]";
	}
	
	
	
	
	
}
