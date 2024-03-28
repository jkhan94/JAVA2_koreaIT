package file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {

		// File 클래스
		// 생성자 매개변수로 파일의 경로와 이름을 전달한다
		// 이클립스에서 상대경로를 사용할 경우 현재 프로젝트가 기준이 된다.

		// 절대 경로 : 내 위치가 어디든, 무조건 찾아가는 경로(드라이브 기준)
		// 상대 경로 : 현재 위치를 기준으로 찾아가는 경로
		// .. : 이전경로
		// . : 현재경로

// 파일 생성
		// 프로젝트 경로에 test.txt 생성
		File file = new File("test.txt");
		// 프로젝트 경로 내 src 폴더에 test1.txt 생성
		File file1 = new File("./src/test1.txt");
		File file2 = new File("src/test2.txt");

		try {
			file.createNewFile();
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

// 파일 존재 여부 확인
		System.out.println(file.exists());
		System.out.println(file1.exists());
		System.out.println(file2.exists());

// 파일 경로 확인
		// 상대 경로
		System.out.println(file.getParent());
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());

		// 절대 경로
		System.out.println(file.getAbsolutePath());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());

// 파일 삭제
		if (file.exists()) {
			file.delete();
		}
		if (file1.exists()) {
			file1.delete();
		}
		if (file2.exists()) {
			file2.delete();
		}

	}

}
