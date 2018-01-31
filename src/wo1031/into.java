package wo1031;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class into {
	public static void main(String[] args) throws Throwable {
		File file=new File("E:\\课程视频与工具\\工具\\FeiQ.exe");
		InputStream is=new FileInputStream(file);
		byte[]b=new byte[(int)file.length()];
		OutputStream os=new FileOutputStream("F:/飞秋.exe");
		int len=is.read(b);
		while(len!=-1) {
			os.write(b, 0, len);
			os.flush();
			len=is.read(b);
		}
		System.out.println("复制完成");
		os.close();
		is.close();
	}
}
