package wo1031;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class into {
	public static void main(String[] args) throws Throwable {
		File file=new File("E:\\�γ���Ƶ�빤��\\����\\FeiQ.exe");
		InputStream is=new FileInputStream(file);
		byte[]b=new byte[(int)file.length()];
		OutputStream os=new FileOutputStream("F:/����.exe");
		int len=is.read(b);
		while(len!=-1) {
			os.write(b, 0, len);
			os.flush();
			len=is.read(b);
		}
		System.out.println("�������");
		os.close();
		is.close();
	}
}
