package POO;

public class Livre extends Article {
	private String format;   // pdf, epub  ou paper
	
	public Livre(String NumProduit, String nom, String format){
		
		super(NumProduit,nom);
		this.format = format;
	}
	
	public Livre(String NumProduit, String nom, double prix, String format){
	      
		super(NumProduit, nom, prix);
		
	}
	
	
	public String getArticleType() {
	        
		return super.getArticleType();
	}

	public String getFormat() {
		
		return format;
	}

	public void setFormat(String format) {
	         
		this.format = format;
	}
	
}
