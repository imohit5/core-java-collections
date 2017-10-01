package map;

public class WeakClassDemo {

	@Override
	public String toString() {
		return "WeakClassDemo []";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");
	}
	
}
