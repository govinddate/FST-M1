package Activities;

import java.io.File;

import org.apache.commons.io.FileUtils;


public class IOTester {

	public static void main(String[] args) {
		File tmpDir = FileUtils.getTempDirectory();
		
System.out.println(tmpDir.getName());
	}

}
