package core.bot.ebay.model.fragment.ebay;

public class MarketingPrice {

	private OriginalPrice originalPrice;
	private String discountPercentage;
	private DiscountAmount discountAmount;
	private String priceTreatment;
	
	public OriginalPrice getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(OriginalPrice originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public DiscountAmount getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(DiscountAmount discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getPriceTreatment() {
		return priceTreatment;
	}
	public void setPriceTreatment(String priceTreatment) {
		this.priceTreatment = priceTreatment;
	}
	
	
}
