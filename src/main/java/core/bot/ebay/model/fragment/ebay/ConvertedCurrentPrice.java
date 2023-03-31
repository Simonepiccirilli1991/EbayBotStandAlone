package core.bot.ebay.model.fragment.ebay;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConvertedCurrentPrice {

	 	@JsonProperty("Value") 
	    private double value;
	    @JsonProperty("CurrencyID") 
	    private String currencyID;
	    
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public String getCurrencyID() {
			return currencyID;
		}
		public void setCurrencyID(String currencyID) {
			this.currencyID = currencyID;
		}
	    
	    
}
