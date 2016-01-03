package ship;

public class WorkInShip extends Thread {

	private boolean flag = false;

	public WorkInShip(String character) {
		super(character);
	}

	public WorkInShip() {
		// TODO Auto-generated constructor stub
	}

	public void run() {

		while (!flag) {

			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
