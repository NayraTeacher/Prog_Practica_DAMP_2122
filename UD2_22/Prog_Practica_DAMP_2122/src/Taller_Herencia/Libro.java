package Taller_Herencia;

public class Libro extends RankElement implements Comparable<Libro>{
	private String title;
	private String author;
	private int publicationYear;
	
	public Libro() {}
	
	public Libro(String title, String author, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	
	@Override
	public String toString() {
		return "Libro [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
	}

	@Override
	public void score(int value, String comment) throws IllegalArgumentException{
		if (value >=1 && value <=5) {
			this.opinions.add(new Opinion(value, comment));
			this.punctuation = calc();
		}
		else
			throw new IllegalArgumentException("Valor de puntuacion no valido. Ha de ser entre 1 y 5");
			
	}
	
	@Override
	public float calc() {
		float result = 0;
		for(Opinion o : this.opinions) {
			result += o.getValue();
		}
		return result/this.opinions.size();
	}

	@Override
	public int compareTo(Libro l) {
		if(this.punctuation == l.punctuation)  
			return 0;  
		else if(this.punctuation<l.punctuation)  
			return 1;  
		else  
			return -1; 

	}
	
	
}
