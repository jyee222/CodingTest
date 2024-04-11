import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		System.out.println(A/B);
        // float을 쓰면 틀림
        // float과 double은 정밀도가 틀림
        // float => 소수점 6~7자리 정도
        // double => 소수점 15~16자리 정도까지 표현이 가능
        
        // 결론 코테에서 웬만하면 float보다는 double을 쓰자!
	}
}