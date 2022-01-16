package program.acessmodifier.p1;

public class P {

	public static void main(String[] args) {
		System.out.println("variables of M class");
		System.out.println("Value of g:"+new M().g);
		System.out.println("value of h:"+new M().h);
		System.out.println("variables of N class");
		System.out.println("Value of n:"+new N().n);
		System.out.println("value of v:"+new N().v);
		
	}
	public void methodPublic() {
		System.out.println("classP: Method is public");
	}
    void defaultmethod() {
		System.out.println("classP: Method is default");
	}
	protected void methodProtected() {
		System.out.println("classP: Method is protected");
	}
	@SuppressWarnings("unused")
	private void methodPrivate() {
		System.out.println("classP: Method is private");
	}
}
