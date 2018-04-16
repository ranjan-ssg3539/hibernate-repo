package prac.rk.models._1_1_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name = "ADDRESS_ID")
	private long addressId;
	
	@Column(name = "ADDRESS_STREET")
	private String street;
	
	@Column(name = "ADDRESS_CITY")
	private String city;
	
	@Column(name = "ADDRESS_STATE")
	private String state;
	
	@Column(name = "ADDRESS_ZIPCODE")
	private String zipCode;
	
	public Address() {
		
	}
	
	public Address(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
