import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		try {
			FileInputStream fis1 = new FileInputStream("/storage/emulated/0/1java/doc1.txt");
			FileInputStream fis2 = new FileInputStream("/storage/emulated/0/1java/doc2.txt");
//ਆਪਾ is java file ਨੂੰ ਵੀ add ਕਰ ਸਕਦੇ।
			FileInputStream fis3 = new FileInputStream("/storage/emulated/0/1java/seqIS.java");
			FileOutputStream fis = new FileOutputStream("/storage/emulated/0/1java/temp/sisdoc789.txt");
			/*
			Data structures ਵਿੱਚ ਇੱਕ vector ਨਾਂਮ ਦੀ class ਹੁੰਦੀ ਹੈ।
			ਆਪਾ vector class ਦਾ object ਬਣਾਂ ਕੇ ਆਪਣੇ files ਦੇ object ਇਸ ਵਿੱਚ add ਕਰ ਦੇਵਾਂਗੇ।
			ਹੁਣ ਇਸਦੇ ਉੱਪਰ add elements method ਚਲਾਵਾਂਗੇ, ਤੇ ਇਹ method Enumeration return ਕਰ ਦਿੰਦਾ ਹੈ।
			Enumeration is a collection.
			*/
//SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
Vector vector = new Vector();
vector.addElement(fis1);
vector.addElement(fis2);
vector.addElement(fis3);
Enumeration enumeration = vector.elements();
SequenceInputStream sis = new SequenceInputStream(enumeration);
			while (true) {
				int size = sis.read();
				if (size == -1)
					break;
				System.out.print((char)size);
				fis.write(size);
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}