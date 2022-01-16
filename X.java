package program.accessmodifier.p2;

public class X {
	private int c=37;
	long f=823984492;
	protected float l=234.35f;
	public char j='M';
    
	public void methodPublic() {
		methodPrivate();
	}
	void defaultmethod() {
		methodPrivate();
	}
	protected void methodProtected() {
		methodPrivate();
	}
	private void methodPrivate() {
		System.out.println("classX: Method is private");
		System.out.println("value of Private c"+c);
		System.out.println("value of long"+f);
		System.out.println("value of protected"+l);
		System.out.println("value of public char"+j);
	}
}
