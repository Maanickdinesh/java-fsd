
public class threaddemo extends Thread {
public void run() {
	System.out.println("Now Thread is Running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threaddemo demo = new threaddemo();
		demo.start(); // start the thread..
	}

}
