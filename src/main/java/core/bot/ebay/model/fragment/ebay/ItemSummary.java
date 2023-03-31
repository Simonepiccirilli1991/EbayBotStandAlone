package core.bot.ebay.model.fragment.ebay;

import java.util.Date;
import java.util.List;

public class ItemSummary {

	private String itemId;
	private String title;
	private List<String> leafCategoryIds;
	private List<Category> categories;
	private Image image;
	private Price price;
	private String itemHref;
	private Seller seller;
	private MarketingPrice marketingPrice;
	private String condition;
	private String conditionId;
	private List<ThumbnailImage> thumbnailImages;
	private List<ShippingOption> shippingOptions;
	private List<String> buyingOptions;
	private String itemAffiliateWebUrl;
	private String itemWebUrl;
	private ItemLocation itemLocation;
	private List<AdditionalImage> additionalImages;
	private boolean adultOnly;
	private String legacyItemId;
	private boolean availableCoupons;
	private Date itemCreationDate;
	private boolean topRatedBuyingExperience;
	private boolean priorityListing;
	private String listingMarketplaceId;
    
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getLeafCategoryIds() {
		return leafCategoryIds;
	}
	public void setLeafCategoryIds(List<String> leafCategoryIds) {
		this.leafCategoryIds = leafCategoryIds;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public String getItemHref() {
		return itemHref;
	}
	public void setItemHref(String itemHref) {
		this.itemHref = itemHref;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public MarketingPrice getMarketingPrice() {
		return marketingPrice;
	}
	public void setMarketingPrice(MarketingPrice marketingPrice) {
		this.marketingPrice = marketingPrice;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getConditionId() {
		return conditionId;
	}
	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}
	public List<ThumbnailImage> getThumbnailImages() {
		return thumbnailImages;
	}
	public void setThumbnailImages(List<ThumbnailImage> thumbnailImages) {
		this.thumbnailImages = thumbnailImages;
	}
	public List<ShippingOption> getShippingOptions() {
		return shippingOptions;
	}
	public void setShippingOptions(List<ShippingOption> shippingOptions) {
		this.shippingOptions = shippingOptions;
	}
	public List<String> getBuyingOptions() {
		return buyingOptions;
	}
	public void setBuyingOptions(List<String> buyingOptions) {
		this.buyingOptions = buyingOptions;
	}
	public String getItemAffiliateWebUrl() {
		return itemAffiliateWebUrl;
	}
	public void setItemAffiliateWebUrl(String itemAffiliateWebUrl) {
		this.itemAffiliateWebUrl = itemAffiliateWebUrl;
	}
	public String getItemWebUrl() {
		return itemWebUrl;
	}
	public void setItemWebUrl(String itemWebUrl) {
		this.itemWebUrl = itemWebUrl;
	}
	public ItemLocation getItemLocation() {
		return itemLocation;
	}
	public void setItemLocation(ItemLocation itemLocation) {
		this.itemLocation = itemLocation;
	}
	public List<AdditionalImage> getAdditionalImages() {
		return additionalImages;
	}
	public void setAdditionalImages(List<AdditionalImage> additionalImages) {
		this.additionalImages = additionalImages;
	}
	public boolean isAdultOnly() {
		return adultOnly;
	}
	public void setAdultOnly(boolean adultOnly) {
		this.adultOnly = adultOnly;
	}
	public String getLegacyItemId() {
		return legacyItemId;
	}
	public void setLegacyItemId(String legacyItemId) {
		this.legacyItemId = legacyItemId;
	}
	public boolean isAvailableCoupons() {
		return availableCoupons;
	}
	public void setAvailableCoupons(boolean availableCoupons) {
		this.availableCoupons = availableCoupons;
	}
	public Date getItemCreationDate() {
		return itemCreationDate;
	}
	public void setItemCreationDate(Date itemCreationDate) {
		this.itemCreationDate = itemCreationDate;
	}
	public boolean isTopRatedBuyingExperience() {
		return topRatedBuyingExperience;
	}
	public void setTopRatedBuyingExperience(boolean topRatedBuyingExperience) {
		this.topRatedBuyingExperience = topRatedBuyingExperience;
	}
	public boolean isPriorityListing() {
		return priorityListing;
	}
	public void setPriorityListing(boolean priorityListing) {
		this.priorityListing = priorityListing;
	}
	public String getListingMarketplaceId() {
		return listingMarketplaceId;
	}
	public void setListingMarketplaceId(String listingMarketplaceId) {
		this.listingMarketplaceId = listingMarketplaceId;
	}
	@Override
	public String toString() {
		return "ItemSummary [itemId=" + itemId + ", title=" + title + ", leafCategoryIds=" + leafCategoryIds
				+ ", categories=" + categories + ", image=" + image + ", price=" + price + ", itemHref=" + itemHref
				+ ", seller=" + seller + ", marketingPrice=" + marketingPrice + ", condition=" + condition
				+ ", conditionId=" + conditionId + ", thumbnailImages=" + thumbnailImages + ", shippingOptions="
				+ shippingOptions + ", buyingOptions=" + buyingOptions + ", itemAffiliateWebUrl=" + itemAffiliateWebUrl
				+ ", itemWebUrl=" + itemWebUrl + ", itemLocation=" + itemLocation + ", additionalImages="
				+ additionalImages + ", adultOnly=" + adultOnly + ", legacyItemId=" + legacyItemId
				+ ", availableCoupons=" + availableCoupons + ", itemCreationDate=" + itemCreationDate
				+ ", topRatedBuyingExperience=" + topRatedBuyingExperience + ", priorityListing=" + priorityListing
				+ ", listingMarketplaceId=" + listingMarketplaceId + "]";
	}
    
    
}
