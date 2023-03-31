package core.bot.ebay.model.fragment.ebay;

import java.util.Date;

public class ShippingOption {

	private String shippingCostType;
	private ShippingCost shippingCost;
	private Date minEstimatedDeliveryDate;
	private Date maxEstimatedDeliveryDate;
	private boolean guaranteedDelivery;
	
	public String getShippingCostType() {
		return shippingCostType;
	}
	public void setShippingCostType(String shippingCostType) {
		this.shippingCostType = shippingCostType;
	}
	public ShippingCost getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(ShippingCost shippingCost) {
		this.shippingCost = shippingCost;
	}
	public Date getMinEstimatedDeliveryDate() {
		return minEstimatedDeliveryDate;
	}
	public void setMinEstimatedDeliveryDate(Date minEstimatedDeliveryDate) {
		this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
	}
	public Date getMaxEstimatedDeliveryDate() {
		return maxEstimatedDeliveryDate;
	}
	public void setMaxEstimatedDeliveryDate(Date maxEstimatedDeliveryDate) {
		this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
	}
	public boolean isGuaranteedDelivery() {
		return guaranteedDelivery;
	}
	public void setGuaranteedDelivery(boolean guaranteedDelivery) {
		this.guaranteedDelivery = guaranteedDelivery;
	}
	
	
}
