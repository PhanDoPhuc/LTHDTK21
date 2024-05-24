package bai03;

public class QuanLySinhVien {

	public static void main(String[] args) {
		// Khai boa doi tuong sv kieu SinhVien
		SinhVien sv;
		// Khai bao doi tuong sv
		sv = new SinhVien();
		//Gan gia tri vho cac thuoc tinh cua doi tuong sv
		sv.hoten = "Phuc";
		sv.namsinh = 2005;
		sv.sdt = "0367689450";
		//xuat gia tri cua doi tuong ra man hinh
		System.out.println("Họ tên: " + sv.hoten + "; Năm sinh " +
							sv.namsinh + ": sdt " + sv.sdt);
		
	}

}
