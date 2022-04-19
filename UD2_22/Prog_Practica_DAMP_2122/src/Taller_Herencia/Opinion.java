package Taller_Herencia;

public class Opinion {

	private int value;
	private String comment;
	
	public Opinion(){}
	
	public Opinion(int value, String comment) {
		super();
		this.value = value;
		this.comment = comment;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Puntos=" + value + ", commentario=" + comment + "\n";
	}
	
	
}
