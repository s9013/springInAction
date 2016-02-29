package com.springInAction.springIdol;

/**
 *
 * @author jay
 * @date Feb 29, 2016
 *
 */
public class Juggler implements Performer {

	private Integer beanBags = 3;

	public Integer getBeanBags() {
		return beanBags;
	}

	public void setBeanBags(Integer beanBags) {
		this.beanBags = beanBags;
	}

	public Juggler() {
	}

	public Juggler(Integer beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("Juggler "+ beanBags + " beanBags ");
	}

}
