import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		/* 민준이는 뒤늦게 정보 과목의 중요성을 깨닫고 학습실에서 공부를 하고 있다.
		기본 공부가 너무 안 되어 있어 아주 쉬운 문제부터 어려움을 겪은 민준이는 친구에게 물어보려고 한다.
		가장 잘 하는 친구에게 물어보기는 질문의 내용이 너무 부끄러워 n명의 친구들 중 정보 성적이 3번째로 높은 친구에게 묻고자 한다.
		친구들의 성적은 모두 다르다.
		n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.
		입력
		첫째 줄에 n이 입력된다. ( 3 <= n <= 50 )
		둘째 줄 부터 n+1행까지 친구의 이름과 점수가 차례대로 입력된다. 이름은 영문
		출력
		세 번째로 높은 학생의 이름을 출력한다.
		입력 예시 
		5
		minsu
		78
		gunho
		64
		sumin
		84
		jiwon
		96
		woosung
		55
		출력 예시
		minsu
		도움말
		문자열인 String과 정수를 나타내는 int를 서로 바꿔야할 때가 있습니다.
		아래 코드는 서로 유형을 바꿔주는 코드입니다.
		String -> int
      	int numInt = Integer.parseInt(numStr);
             System.out.println(numInt);
		Int -> Stri	ng
     		String numStr2 = String.valueOf(numInt);
        System.out.println(numStr2);
		 */
		String[][] students = new String[50][2];
		//{ {"이름","성적"},
		//  {"이름","성적"},
		//}
		Scanner sc = new Scanner(System.in);
		int n = 5;
		for(int i=0; i<5; i++) {
			students[i][1] = sc.next();
			students[i][0] = sc.next();
		}
		//내림차순 정렬(성적이 높은 순으로 정렬)
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				int score1 = Integer.parseInt(students[i][1]);
				int score2 = Integer.parseInt(students[j][1]);
				if(score2>score1) { //치환해야 됨.
					String temp1 = students[i][0];
					String temp2 = students[i][1];
					students[i][0] = students[j][0];//이름
					students[i][1] = students[j][1];//성적
					students[j][0] = temp1;
					students[j][1] = temp2;
				}
			}
		}
		System.out.println("세번째 학생은");
		System.out.println(students[2][0]);
		System.out.println(students[2][1]);
	}


}


