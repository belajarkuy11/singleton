package singleton;

public class SampleTon {
	private static final SampleTon st = new SampleTon();
	
	private SampleTon() { }
	
	public static SampleTon getSampleTon() {
		return st;
	}
}
