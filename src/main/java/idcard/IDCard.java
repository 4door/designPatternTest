package idcard;

import framework.*;

public class IDCard extends Product {
	private String owner;
	private Integer no;
	IDCard(String owner, Integer no) {
		System.out.println(owner + no + "のカードを作ります");
		this.owner = owner;
	}
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}
	public Integer getNo() {
		return no;
	}
}
