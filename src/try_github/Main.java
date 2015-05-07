package try_github;

public class Main {

	public static void main(String[] args) {
		ADD add=new ADD();
		Sub sub=new Sub();

		System.out.println("aとbの和：" + add.add(2, 5));
		System.out.println("aとbの差：" + sub.sub(2, 5));
	}

}
