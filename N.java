package program.acessmodifier.p1;

public class N {
	protected long k=93409546l;
	public int n=239;
	double v=345675.46767;
	
	public void methodPublic() {
		System.out.println("classN:Method is public");
		methodPrivate();
	}
	void defaultmethod() {
		System.out.println("classN:Method is default");
	}
	protected void methodProtected() {
		System.out.println("classN:Method is protected");
	}
	@SuppressWarnings("unused")
	private void methodPrivate() {
		System.out.println("classN:Method is private");
		System.out.println("k value is"+k);
		System.out.println("n value is"+n);
		System.out.println("v value is"+v);
	}
}
