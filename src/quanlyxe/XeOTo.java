package quanlyxe;

public class XeOTo extends Xe {
	public XeOTo(int id, String name, String branch, String madein, int price) {
		super(id,name,branch,madein,price);
	}

	@Override public String hienthi(){
		return "Xe � T�{"+"id="+getId()+", name="+getName()+", branch="+getBranch()+", madein="+getMadein()+", price="+getPrice()+"}";
	}
}
