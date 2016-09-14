package in.mgp.pc;

class Producer extends Thread {

	private final CubbyHole cubbyHole;
	private final int number;

	public Producer(CubbyHole cubbyHole, int number) {
		super();
		this.cubbyHole = cubbyHole;
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			cubbyHole.put(i);
			System.out.println("Producer with # " + this.number + " : put : "
					+ i);

			try {
				sleep(10);
			} catch (InterruptedException ie) {
			}
		}
	}
}
