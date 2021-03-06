package Customer_System;

public class Address 
{
	private final String dispOnCheck;
	private final String billStreet;
	private final String billCity;
	private final String billState;
	private final String billZip;
	private final String billCountry;
	private final String shipStreet;
	private final String shipCity;
	private final String shipState;
	private final String shipZip;
	private final String shipCountry;
	private final String addressDetails;
	
	public Address(String dispOnCheck, String billStreet, String billCity, String billState, String billZip,
			String billCountry, String shipStreet, String shipCity, String shipState, String shipZip,
			String shipCountry, String addressDetails) {
		super();
		this.dispOnCheck = dispOnCheck;
		this.billStreet = billStreet;
		this.billCity = billCity;
		this.billState = billState;
		this.billZip = billZip;
		this.billCountry = billCountry;
		this.shipStreet = shipStreet;
		this.shipCity = shipCity;
		this.shipState = shipState;
		this.shipZip = shipZip;
		this.shipCountry = shipCountry;
		this.addressDetails = addressDetails;
	}

	public String getDispOnCheck() {
		return dispOnCheck;
	}

	public String getBillStreet() {
		return billStreet;
	}

	public String getBillCity() {
		return billCity;
	}

	public String getBillState() {
		return billState;
	}

	public String getBillZip() {
		return billZip;
	}

	public String getBillCountry() {
		return billCountry;
	}

	public String getShipStreet() {
		return shipStreet;
	}

	public String getShipCity() {
		return shipCity;
	}

	public String getShipState() {
		return shipState;
	}

	public String getShipZip() {
		return shipZip;
	}

	public String getShipCountry() {
		return shipCountry;
	}

	public String getAddressDetails() {
		return addressDetails;
	}
}
