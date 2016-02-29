package com.springInAction.springIdol;

/**
 *
 * @author jay
 * @date Feb 29, 2016
 *
 */
public class PoeticJuggler extends Juggler {

	private Poem poem;

	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}

	@Override
	public void perform() {
		super.perform();
		System.out.println("While reciting");
		poem.recite();
	}

}
