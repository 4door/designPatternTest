package factoryMethod;
import framework.*;
import idcard.*;

public class main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("よん");
		Product card2 = factory.create("しおり");
		Product card3 = factory.create("shiori");
		card1.use();
		card2.use();
		card3.use();
	}

}
