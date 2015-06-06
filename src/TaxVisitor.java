import java.text.DecimalFormat;


public class TaxVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxVisitor(){
		
	}
	
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .18)+ liquorItem.getPrice()));
	}

	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco item: Price with Tax");
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32)+ tobaccoItem.getPrice()));
	}

	public double visit(Necessity necessityItem) {
		System.out.println("Tobacco item: Price with Tax");
		return Double.parseDouble(df.format((necessityItem.getPrice() * 0)+ necessityItem.getPrice()));
	}
}