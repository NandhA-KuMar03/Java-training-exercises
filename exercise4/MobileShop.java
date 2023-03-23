package visitor;
public interface MobileShop {
	public void ComparePhones(MobileShopVisitor user);
}
class Poorvika implements MobileShop{
	int price;
	String cashType;
	public Poorvika(int price, String payment) {
		this.price = price;
		cashType = payment;
	}
	@Override
	public void ComparePhones(MobileShopVisitor user) {
		user.visit(this);
	}
}
class Viveks implements MobileShop{
	int price;
	String cashType;
	public Viveks(int price, String payment) {
		this.price = price;
		cashType = payment;
	}
	@Override
	public void ComparePhones(MobileShopVisitor user) {
		user.visit(this);
	}
}