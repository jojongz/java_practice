package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%7 != 0) {
				continue;				
			}
			System.out.println(i);
		}

	}

}
