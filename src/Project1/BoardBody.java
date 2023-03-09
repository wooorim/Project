package Project1;

public class BoardBody {
	
	protected String title;
	protected String body;
	protected String name;
	protected String date;
		

	public BoardBody(String title, String body, String name, String date) {
		this.title = title;
		this.body = body;
		this.name = name;
		this.date = date;
	}
	@Override
	public String toString() {
		return ("力格: " + title +" 郴侩: " + body + " 累己磊: " + name + " 累己老: " + date);
	}
}
