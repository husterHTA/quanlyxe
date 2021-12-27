package quanlyxe;

public class XeMay extends Xe {
	public XeMay(int id, String name, String branch, String madein, int price) {
		super(id,name,branch,madein,price);
	}

	@Override public String hienthi(){
		return "Xe máy{"+"id="+getId()+", name="+getName()+", branch="+getBranch()+", madein="+getMadein()+", price="+getPrice()+"}";
	}
}
