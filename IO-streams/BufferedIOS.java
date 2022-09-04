import java.io.*;
public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("/storage/emulated/0/1videos/sr.mp4");
		BufferedInputStream bfis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("/storage/emulated/0/1videos/video63.mp4");
		BufferedOutputStream bfos = new BufferedOutputStream(fos);
		while (true){
			int size = bfis.read();
			if (size==-1)
			break;
			bfos.write(size);
		}
			try {
				bfos.close();
				bfos.flush();
			}catch (IOException e) {}
		} catch ( Exception e ) {
			
		}
	}
}