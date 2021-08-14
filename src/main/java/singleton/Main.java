package singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
		}

		if (obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンスです。");
		} else {
			System.out.println("obj1とobj2は同じインスタンスではありません。");
		}
		System.out.println("End.");
	}

}
