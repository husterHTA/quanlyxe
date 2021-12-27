package quanlyxe;

public class Xe {
	private int id;
	private String name;
	private String branch;
	private String madein;
	private int price;
	
	public Xe() {
	
	}
	
	public Xe(int id, String name, String branch, String madein, int price) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.madein = madein;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String hienthi() {
		return "Hiển thị thông tin xe";
	}
}
