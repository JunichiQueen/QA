public class Book extends Media {
	private String title;
	private int numPage;

	public void setNumPage(int page) {
		this.numPage = page;
	}

	public Book(String title, int numPage) {
		this.title = title;
		this.numPage = numPage;
	}

}
