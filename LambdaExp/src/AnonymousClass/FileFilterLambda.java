package AnonymousClass;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String... args) {
		/*FileFilter fileFilter = new FileFilter(){

			@Override
			public boolean accept(File file) {
				
				return file.getName().endsWith(".java");
			}
			
		};*/
		
		FileFilter fileFilterLambda = (File file) -> file.getName().endsWith("a");
		
		File dir = new File("D:\\java prg");
		
		File [] files = dir.listFiles(fileFilterLambda);
	if(files!=null){
		for(File f:files){
			System.out.println(f);
		}
	}
	}

}
