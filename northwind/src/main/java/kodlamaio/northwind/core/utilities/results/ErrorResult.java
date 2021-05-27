package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	public ErrorResult() {
		// TODO Auto-generated constructor stub
		super(false);
	}
	public ErrorResult(String message) {
		// TODO Auto-generated constructor stub
		super(false,message);
	}
}
