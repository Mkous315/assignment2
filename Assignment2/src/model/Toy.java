package model;

public class Toy {
String name;
int serialNumber;
String brandName;
double price;
int availableCount;
int ageAppropriate;

public Toy(String name, int serialNumber, String brandName, double price, int availableCount, int ageAppropriate)
{
	//explanation comment
	this.name = name;
	this.serialNumber = serialNumber;
	this.brandName = brandName;
	this.price = price;
	this.availableCount = availableCount;
	this.ageAppropriate = ageAppropriate;	
}
// getters and setters 
public String getName(String name) {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public int getSerialNumber(int serialNumber) {
	return this.serialNumber;
}
public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}
public String getBrandName(String brandName) {
	return this.brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public double getPrice(double price) {
	return this.price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getAvailableCount(int availableCount) {
	return this.availableCount;
}
public void setAvailableCount(int availableCount) {
	this.availableCount = availableCount;
}
public int getAgeAppropriate(int ageAppropriate) {
	return this.ageAppropriate;
}
public void setAgeAppropriate(int ageAppropriate) {
	this.ageAppropriate = ageAppropriate;
}
// to string: returns a string representation
public String toString() {
	
}
}
