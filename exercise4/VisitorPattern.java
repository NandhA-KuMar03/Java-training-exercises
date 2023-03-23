package visitor;

interface MobileShopVisitor{
	public void visit(Poorvika poorvika);
	public void visit(Viveks viveks);
}
class UserVisitor implements MobileShopVisitor{
	@Override
	public void visit(Poorvika poorvika) {
		int pricePoorvika = poorvika.price;
		if(poorvika.cashType == "Cash")
			pricePoorvika-=2000;
		if(poorvika.cashType == "Card")
			pricePoorvika-=2500;
		System.out.println(pricePoorvika + " In Poorvika");
	}
	@Override
	public void visit(Viveks viveks) {
		int priceViveks = viveks.price;
		if(viveks.cashType == "Cash")
			priceViveks-=3000;
		if(viveks.cashType == "Card")
			priceViveks-=3500;
		System.out.println(priceViveks +" In Viveks");
	}
}
public class VisitorPattern{
	public static void main(String[] args) {
		MobileShopVisitor obj = new UserVisitor();
		MobileShop games[] = { new Poorvika(25000,"Cash"), new Viveks(5000, "Card")};
		for(MobileShop mob : games) {
			mob.ComparePhones(obj);
		}
	}
}