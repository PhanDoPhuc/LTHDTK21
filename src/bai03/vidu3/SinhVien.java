package bai03.vidu3;

public class SinhVien {
	private String hoten;
	private int namsinh;
	private String sdt;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		if (namsinh <= 1900) {
			System.out.println("Nam sinh " + namsinh + " không hợp lệ");
		} else {
			this.namsinh = namsinh;
		{
			this.namsinh = namsinh;
		}
				}	
		
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "SinhVien [hoten=" + hoten + ", namsinh=" + namsinh + ", sdt=" + sdt + "]";
	}
	
}

