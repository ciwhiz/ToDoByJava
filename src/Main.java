import java.text.SimpleDateFormat;
import java.util.Date;

import utils.Utils;

public class Main {

	public static void main(String[] args) {
		
		boolean loopFlag = true;
		int userInput = 0;
		while(loopFlag) {
			displayMenu();
			userInput = Utils.getUserInputScanner();
			switch (userInput) {
			case 1:
				inputMemo();
				break;
			case 2:
				showMemoList();
				break;
			case 3:
				loadMemo();
				break;
			case 4:
				deleteMemo();
				break;
			case 5:
				searchMemo();
				break;
			case 6:
				sortingMemo();
				break;
			case 7:
				loopFlag = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("1~7 사이의 숫자를 입력하세요.");
				break;
			}
			
		}
		System.out.println("while문 밖");
	}
	
	private static void sortingMemo() {
		// TODO Auto-generated method stub
		
	}

	private static void searchMemo() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteMemo() {
		// TODO Auto-generated method stub
		
	}

	private static void loadMemo() {
		// TODO Auto-generated method stub
		
	}

	private static void showMemoList() {
		// TODO Auto-generated method stub
		
	}

	private static void inputMemo() {
		String title="";
		String contents="";
		String writtenTime="";
		System.out.println("메모를 입력하세요..");
		System.out.print("제목을 입력하세요: ");
		title = Utils.getUserInputBufferReader();
		System.out.println();
		System.out.print("내용을 입력하세요: ");
		contents = Utils.getUserInputBufferReader();
		System.out.println();
		System.out.print("메모입력 시간: " + writtenTime);
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss a");
		writtenTime = sdf.format(currentDate).toString();
	}

	private static void displayMenu() {
		System.out.println("==============  To Do  ==============");
		System.out.println("1. 메모 입력");
		System.out.println("2. 메모 리스트 출력");
		System.out.println("3. 메모 읽기");
		System.out.println("4. 메모 삭제");
		System.out.println("5. 메모 검색");
		System.out.println("6. 메모 정렬");		
		System.out.println("7. 종     료");		
		System.out.print("입력:> ");
    }

	//TO DO
	/*	1.     메뉴 표시하기(메모 입력, 메모 리스트 출력, 메모 읽기, 메모 삭제, 메모 검색)
		2.     메모 입력 하기(제목, 내용, 작성 시간)
		3.     메모 리스트 출력하기(제목, 작성 시간)
		4.     메모 읽기(제목, 내용, 작성 시간)
		5.     메모 삭제
		6.     메모 검색(제목 검색, 내용 검색, 시간 범위 검색)*/
}
