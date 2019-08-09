package cust;

public class Customer {
	private int customerID;
	String customerName;
	String customerAddress;
	int billAmnt;
	public Customer(int customerID, String customerName, String customerAddress, int billAmnt) {
		
		this.customerID =2;
		this.customerName ="B" ;
		this.customerAddress = "Chennai";
		this.billAmnt = 2000;
	}
	public Customer(int customerID, String customerName, String customerAddress) {
		this();
		this.customerID = 3;
		this.customerName = "C";
		this.customerAddress = "Delhi";
	}
	public Customer(int customerID, String customerName) {
		this();
		this.customerID = 4;
		this.customerName ="D";
	}
	public Customer() {
		customerID=1;
		customerName="A";
		customerAddress="Bangalore";
				billAmnt=1000;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmnt=" + billAmnt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmnt;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerID;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmnt != other.billAmnt)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerID != other.customerID)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getBillAmnt() {
		return billAmnt;
	}
	public void setBillAmnt(int billAmnt) {
		this.billAmnt = billAmnt;
	}
	

}
