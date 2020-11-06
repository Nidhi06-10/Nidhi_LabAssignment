
class Tablet extends Medicine {

	Tablet(String medicineName, double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
	}

	@Override
	String dispMedicineInfo() {
		return "Store in Cool and Dry Place";
	}
}