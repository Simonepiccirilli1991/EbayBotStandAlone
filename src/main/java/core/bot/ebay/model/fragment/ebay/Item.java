package core.bot.ebay.model.fragment.ebay;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {

	@JsonProperty("ItemID") 
    private String itemID;
    @JsonProperty("EndTime") 
    private Date endTime;
    @JsonProperty("BidCount") 
    private int bidCount;
    @JsonProperty("ConvertedCurrentPrice") 
    private ConvertedCurrentPrice convertedCurrentPrice;
    @JsonProperty("ListingStatus") 
    private String listingStatus;
    @JsonProperty("TimeLeft") 
    private String timeLeft;
    
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getBidCount() {
		return bidCount;
	}
	public void setBidCount(int bidCount) {
		this.bidCount = bidCount;
	}
	public ConvertedCurrentPrice getConvertedCurrentPrice() {
		return convertedCurrentPrice;
	}
	public void setConvertedCurrentPrice(ConvertedCurrentPrice convertedCurrentPrice) {
		this.convertedCurrentPrice = convertedCurrentPrice;
	}
	public String getListingStatus() {
		return listingStatus;
	}
	public void setListingStatus(String listingStatus) {
		this.listingStatus = listingStatus;
	}
	public String getTimeLeft() {
		return timeLeft;
	}
	public void setTimeLeft(String timeLeft) {
		this.timeLeft = timeLeft;
	}
    
    
}
