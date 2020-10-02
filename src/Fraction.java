
public class Fraction {
	private int num;
	private int denom;
	
	Fraction(int x, int y){
		this.num = x;
		this.denom = y;
	}
	
	public String toString() {
		System.out.println(this.num + "/" + this.denom);
		return this.num + "/" + this.denom;
	}
}
