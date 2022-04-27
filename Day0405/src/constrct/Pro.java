package constrct;

// setter 없이!

public class Pro {

	private String name;
	private int pri;
	private String lim;
	
	public Pro(String name, int pri, String lim) {
		this.name = name;
		this.pri = pri;
		this.lim = lim;
	}
	
	public int total(int cnt) {
		return pri*cnt;
	}
	
	public String getName() {
		return name;
	}
	public int getPri() {
		return pri;
	}
	public String getLim() {
		return lim;
	}
	
	public String sale() {
		String[] limDate = lim.split("-"); 
		int year = Integer.parseInt(limDate[0]);
		int mon = Integer.parseInt(limDate[1]);
		int day = Integer.parseInt(limDate[2]);
		
		if (year<=2022 && mon<=12 && day<=22) {
			return "판매 가능";
		} else {
			return "판매 불가능";
		}
	}
}












