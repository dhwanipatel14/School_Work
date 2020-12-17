
public class ComboLock {
	private int secret1;
	private int secret2;
	private int secret3;
	private int dial1, dial2, dial3;
	private boolean place1, place2, place3;
	private boolean unlock;

	/*
	 * Default Constructor
	 */
	public ComboLock() {
		this.dial1 = 0;
		this.dial2 = 0;
		this.dial3 = 0;
		this.place1 = true;
		this.place2 = false;
		this.place3 = false;

	}

	/*
	 * Second Constructor with
	 * 
	 * @param secret1,secret2,secret3 Numbers of the lock
	 */
	public ComboLock(int secret1, int secret2, int secret3) {
		this();
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	}

	/*
	 * Method to reset the dial
	 */
	public void reset() {
		this.dial1 = 0;
		this.dial2 = 0;
		this.dial3 = 0;
	}

	/*
	 * Method to turn left
	 * 
	 * @param ticks Ticks enter to move Left
	 */
	public void turnLeft(int ticks) {
		// Moves from place one to three
		if (place1 == true) {
			this.dial1 = dial1 + ticks;

			place1 = false;
			place2 = true;

		} else if (place2 == true) {
			this.dial2 = dial2 + ticks;
			place2 = false;
			place3 = true;

		} else {
			this.dial3 = dial3 + ticks;
			place3 = false;
			place1 = true;

		}
	}

	/*
	 * Method to turnRight
	 * 
	 * @param ticks ticks entered by user
	 */
	public void turnRight(int ticks) {
		if (place1 == true) {
			// checks if operation is positive or not and simultaneously sets the value.
			if ((dial1 - ticks) > 0)
				this.dial1 = dial1 - ticks;
			else {
				this.dial1 = (40 - (dial1 - ticks));
			}
			place1 = false;
			place2 = true;

		} else if (place2 == true) {

			if ((dial1 - ticks) > 0)
				this.dial1 = dial1 - ticks;
			else {
				this.dial1 = (40 - (dial1 - ticks));
			}

			place2 = false;
			place3 = true;

		} else {

			if ((dial1 - ticks) > 0)
				this.dial1 = dial1 - ticks;
			else {
				this.dial1 = (40 - (dial1 - ticks));
			}
			place3 = false;
			place1 = true;

		}
	}

	/*
	 * Method to open the lock
	 * 
	 * @return true if successful or else false.
	 */
	public boolean open() {
		if ((dial1 == secret1) && (dial2 == secret2) && (dial3 == secret3)) {
			return true;
		}
		return false;
	}

}
