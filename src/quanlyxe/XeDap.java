package quanlyxe;

public class XeDap extends Xe {
	public XeDap(int id, String name, String branch, String madein, int price) {
		super(id,name,branch,madein,price);
	}

	@Override public String hienthi(){
		return "Xe đạp{"+"id="+getId()+", name="+getName()+", branch="+getBranch()+", madein="+getMadein()+", price="+getPrice()+"}";
	}
}
