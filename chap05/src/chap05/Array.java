package chap05;

public class Array {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int score[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
		for(int i = 0; i < 30; i++) {
			System.out.println("score["+i+"]=" + score[i]);
			sum += score[i];
		}
		avg = sum / 10;
		
		System.out.println("sum" + sum);
		System.out.println("avg" + avg);
	}

}
