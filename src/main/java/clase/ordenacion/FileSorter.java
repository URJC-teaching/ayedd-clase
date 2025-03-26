package clase.ordenacion;

import edu.princeton.cs.algs4.*;
import java.io.File;

public class FileSorter{

    public static void main(String[] args){
		File directory = new File(args[0]);
		File[] files = directory.listFiles();
		assert files != null;
		Insertion.sort(files);
		for (File file : files) StdOut.println(file.getName());
    }
}
    
   
