package days03;

import java.util.Scanner;
//ctrl + shift- o 임포트해줌
/**
 * @author geon
 * @date 2024. 1. 3. - 오전 11:44:59
 * @subject
 * @content
 */
public class Ex00 {

	public static void main(String[] args) {
		String input = "1 fish 2 fish red fish blue fish";
		// \\s*fish\\s* 구분자
		// \s == space == 공백
		// * 반복횟수 0~여러개 와도 된다. 없어도되고 여러개있어도 된다.
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");//<- 이걸 구분자로 쓰겠다. 근데 없어지면
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		

	}

}
