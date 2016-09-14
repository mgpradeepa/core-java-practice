package in.mgp.pc;

class Consumer extends Thread {
	private CubbyHole cubbyHole;
	private int number;

	public Consumer() {
	}

	public Consumer(CubbyHole cubbyHole, int number) {
		super();
		this.cubbyHole = cubbyHole;
		this.number = number;
	}

	@Override
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = cubbyHole.get();
			System.out.println("Consumer with # " + this.number + " : got : "
					+ value);
		}
	}

}
