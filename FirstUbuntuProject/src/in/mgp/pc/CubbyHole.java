package in.mgp.pc;

public class CubbyHole {
	private int contents = 0;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();

			} catch (InterruptedException e) {

			}
			contents = value;
			available = true;
			notifyAll();
		}
	}

}
