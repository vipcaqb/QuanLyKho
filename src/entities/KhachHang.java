package entities;

public class KhachHang {
	private String TenKhachHang;
	private String DiaChi;
	private String Sdt;
	private String FAX;
	
	public KhachHang() {
		TenKhachHang = "";
		DiaChi = "";
		Sdt = "";
		FAX = "";
	}

	public String getTenKhachHang() {
		return TenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		TenKhachHang = tenKhachHang;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSdt() {
		return Sdt;
	}

	public void setSdt(String sdt) {
		Sdt = sdt;
	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String fAX) {
		FAX = fAX;
	}
	
	
}
