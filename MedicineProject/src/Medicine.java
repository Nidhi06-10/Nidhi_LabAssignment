
class Medicine {
	String medicineName, compName;
	double medicinePrice;
	String expiryDate;

	Medicine() {
	}

	Medicine(String medicineName, double medicinePrice, String compName, String expiryDate) {
		this.medicineName = medicineName;
		this.medicinePrice = medicinePrice;
		this.compName = compName;
		this.expiryDate = expiryDate;
	}

	// @Override
	public String toString() {
		return String.format("Name : " + medicineName + "\n" + "Price : " + medicinePrice + "\n" + "Company Name : "
				+ compName + "\n" + "Expiry Date : " + expiryDate);
	}

	String dispMedicineInfo() {
		return "";
	}
}