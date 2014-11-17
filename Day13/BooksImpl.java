public class BooksImpl implements Books{
	final private String title;
	final private String author;
	BooksImpl(String title, String author){
		this.title = title;
		this.author = author;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
}