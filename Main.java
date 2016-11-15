import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==============  To Do  ==============");
		while(true) {
			char userInput = '0';  
			System.out.println("1. 메모 입력");
			System.out.println("2. 메모 리스트 출력");
			System.out.println("3. 메모 읽기");
			System.out.println("4. 메모 삭제");
			System.out.println("5. 메모 검색");
			System.out.println("6. 메모 정렬");		
			System.out.print("입력:> ");
			try {
				userInput = (char)System.in.read();	//read는 int return.
				System.out.println("입력값: " + userInput);
			} catch (Exception e) {
				e.getMessage();
			}
			break;
		}
	}
	

	//TO DO
	/*	1.     메뉴 표시하기(메모 입력, 메모 리스트 출력, 메모 읽기, 메모 삭제, 메모 검색)
		2.     메모 입력 하기(제목, 내용, 작성 시간)
		3.     메모 리스트 출력하기(제목, 작성 시간)
		4.     메모 읽기(제목, 내용, 작성 시간)
		5.     메모 삭제
		6.     메모 검색(제목 검색, 내용 검색, 시간 범위 검색)*/
}
