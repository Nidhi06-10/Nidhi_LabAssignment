
class Ointment extends Medicine {
	Ointment(String medicineName, double medicinePrice, String compName, String expiryDate) {
		super(medicineName, medicinePrice, compName, expiryDate);
	}

	@Override
	String dispMedicineInfo() {
		return "For External Use Only";
	}
}