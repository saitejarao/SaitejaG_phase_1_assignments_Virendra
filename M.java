package program.acessmodifier.p1;

public class M {
private int i=34;
long g=34445;
protected float h=394.556f;
	
	
	public void methodPublic() {
		System.out.println("classM: Method is public");
		methodPrivate();
	}
	void defaultmethod() {
		System.out.println("classM: Method is default");
	}
	protected void methodProtected() {
		System.out.println("classM: Method is protected");
	}
	@SuppressWarnings("unused")
	private void methodPrivate() {
		System.out.println("classM: Method is private");
		System.out.println("i value is"+i);
		System.out.println("g value is"+g);
		System.out.println("h value is"+h);
	}
}
