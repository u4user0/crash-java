import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		lectures t = new lectures();
		//	t.lec4();
		t.read_write_sameFile();
		t.BufferedRead();
		t.BufferedWrite();
	}
}
class lectures {
		FileOutputStream file22;
			BufferedOutputStream output22;
//	FileInputStream fis;
//	FileOutputStream fos;
	public void lec4() {
		System.out.println("Enter text to save");
		Scanner scanInput = new Scanner(System.in);
		String text = scanInput.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream("/storage/emulated/0/1java/crash.txt", true);
			byte b[] = text.getBytes();
			fos.write(b);
			System.out.println("you entered: " + text);
		} catch (Exception e) {}
	}
	public void read_write_sameFile() {
		try {
			FileInputStream fis = new FileInputStream("/storage/emulated/0/1java/lec1-6.io.txt");
			FileOutputStream fos = new FileOutputStream("/storage/emulated/0/1java/demo.txt");
			while (true) {
				int size = fis.read();
				if (size == -1)
					break;
				fos.write(size);

			}
		} catch (Exception e) {}
	}
	public void BufferedWrite() {
		
				try {
			file22 = new FileOutputStream("/storage/emulated/0/1videos/ac017.txt");
 output22 = new BufferedOutputStream(file22);
			String text = "This is a line of text inside the file";
			byte[] b = text.getBytes();
			output22.write(b);
//output22.close(); is nall ja finaly block nal
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}finally {
		try{
	output22.flush();
			output22.close();
		}catch (IOException e ){
			System.out.println(""+e);
		}
		}
	}
	public void BufferedRead() {
		try {
			FileInputStream inputStream = new FileInputStream("/storage/emulated/0/1java/crash.txt");
			BufferedInputStream buffer = new BufferedInputStream(inputStream);
			while (true) {
				int a = buffer.read();
				if (a == -1)
					System.exit(0);//break();
				System.out.print((char)a);
			}
		} catch (Exception e) {}
	}
}