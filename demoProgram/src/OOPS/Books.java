package OOPS;

public class Books {
	private String BookType;
	private String Bno;
	
	public String getBookType() {
		return BookType;
	}
	public void setBookType(String BookType) {
		this.BookType=BookType;
	}
	public String getBno() {
		return Bno;
	}
	public void setBno(String bno) {
		this.Bno = bno;
	}
	@Override
	public String toString() {
		return "Book [BookType=" + BookType + ", BNO=" + Bno + "]";
	}
	

}
