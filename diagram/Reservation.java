public class Reservation extends Campsite {

	private int numberOfPersons;

	private LocalDate startDate;

	private LocalDate endDate;

	private boolean car;

	private Campsite campsite;

	public void Reservation(int numberOfPersons, LocalDate startDate, LocalDate endDate, boolean car) {

	}

	public double getCost() {
		return 0;
	}

	public int getDurationDays() {
		return 0;
	}

	public boolean isHolidayPeriod() {
		return false;
	}

	public double getLocationCost() {
		return 0;
	}

	public double getPersonCost() {
		return 0;
	}

	public double getCarCost() {
		return 0;
	}

	public double getHoliddayMultiplier() {
		return 0;
	}

}
