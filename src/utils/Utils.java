package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utils {
	
	//int return , Scanner
	public static int getUserInputScanner() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();
		return input;
	}
	
	//String return ,  BufferReader 
	public static String getUserInputBufferReader() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String str = "";
			System.out.println("끝내고 싶다면 Ctrl + C를 입력하시오");
			//while(!(str = br.readLine()).equals("@esc")) {		///@esc
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();		//순서 중요. br먼저 close 먼저 open한 br
			isr.close();
			return str;
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
		return null;
	}
	
	//char return , ByteArray
	public static char getUserInputByteArr() {
		byte[] bit = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(bit);
			return (char) bit[len];
		} catch (Exception e) {
			System.out.println("입력실패");
		}
		return 'a';
	}
}
