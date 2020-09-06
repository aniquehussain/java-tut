package fileprocessors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockFileReader {
	
	String filePath = null;
	
	public StockFileReader(String filePath){
		this.filePath = filePath;
	}

	public List<String> getHeaders() throws IOException{

		String line = readFirstLine(filePath);
		String [] header = line.split(",");
		List<String> values = new ArrayList<>();
		values = Arrays.asList(header);
		return values;

	}
	
	static String readFirstLine(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}
	/**
	 * Complete the body of this method.
	 * @return List
	 * @throws IOException
	 */
	public List<String> readFileData() throws IOException{
		List<String> lines = new ArrayList<String>();
		// Insert your code here..
		try(FileReader fileReader = new FileReader(filePath);
		BufferedReader buffReader = new BufferedReader(fileReader)){
            buffReader.readLine();
			String line = buffReader.readLine();
			while(line != null){
				lines.add(line);
				line = buffReader.readLine();
			}

		}catch (IOException e){
			e.printStackTrace();
		}
	    return lines;
	}

}
