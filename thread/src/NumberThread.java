
public class NumberThread extends Thread {
	private int start;
	private int end;
	public NumberThread(int start,int end) {
		this.start  = start;
		this.end  = end;
		
	}
	@Override
	public void run() {
		print();
	}
	public void print() {
		Thread t = Thread.currentThread();
		for (int i = start; i < end; i++) {
			System.out.println(t.getName() + ":" + i);
		}}
}
