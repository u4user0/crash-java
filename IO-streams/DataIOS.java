import java.io.*;
public class Main {
	public static void main(String[] args) {
		try {
// EXAMPLE1:
/*	
FileInputStream fis = new FileInputStream("/storage/emulated/0/1java/doc1.txt");
			DataInputStream dis = new DataInputStream(fis);
// to display first line
// 	String str = dis.readLine();
// 	System.out.println(str);
// to display full file
			String str = "";
			while (true) {
				str = dis.readLine();
				if(str!=null)
					//break;
					System.out.println(str);
			}
*/

// EXAMPLE2:
		/*	FileOutputStream fos = new FileOutputStream("/storage/emulated/0/1java/tmp/crash.txt");
			DataOutputStream dos = new DataOutputStream(fos);
//ਇਹ byte ਦੇ ਵਿੱਚ save ਕਰ ਰਿਹਾ ਹੈ ਪਹਿਲਾਂ ਵਾਂਗ
//We can use utf method here
			//dos.writeInt(88);dos.writeFloat(67.4f);dos.writeChar('c');
			dos.writeUTF("\n\t 6uu \n hey a");
			FileInputStream fis = new FileInputStream("/storage/emulated/0/1java/tmp/crash.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("DataInputStream ex\n__________");
			int a1 = dis.readInt();
			int a2 = dis.readInt();
			String str = dis.readLine();
			System.out.println(a1 +" : "+a2);
			System.out.println(str);
 */
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*

*/