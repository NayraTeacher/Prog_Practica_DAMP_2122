package Taller_Herencia;

import java.util.ArrayList;

public abstract class RankElement {
	
	protected float punctuation;
	protected ArrayList<Opinion> opinions = new ArrayList<Opinion>();
	
	public abstract void score(int value, String comment) throws IllegalArgumentException;
	public abstract float calc();
	
}
