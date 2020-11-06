
class Syrup extends Medicine {
	Syrup(String medicineName, double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
	}

	@Override
	String dispMedicineInfo() {
		return "Shake well before Use";
	}
}