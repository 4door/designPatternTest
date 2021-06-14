package idcard;

import java.util.*;
import framework.*;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<>();
	private Integer no = 100;
	protected Product createProduct(String owner) {
		return new IDCard(owner, no++);
	}
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List<String> getOwners() {
		return owners;
	}
}
