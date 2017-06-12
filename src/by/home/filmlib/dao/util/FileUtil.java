package by.home.filmlib.dao.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import by.home.filmlib.dao.exception.DAOException;

public class FileUtil {
	
	public static List<String> readData(String filePath) throws DAOException{
		List<String> dataList = new ArrayList<String>();
		String line;
		try(BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(filePath), Charset.forName("UTF-8")))) {
		    while ((line = br.readLine()) != null) {
		    	dataList.add(line);
	       }
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		
		return dataList;
		
	}
	
	public static void writeDataInFile(Collection<String> data, String filePath) 
																	throws DAOException{
		try(BufferedWriter bufferedWriter = new BufferedWriter(
											new OutputStreamWriter(
											new FileOutputStream(filePath), "UTF-8"));) {
			for(String str: data) {
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			throw new DAOException(e);
		} 
	}

}
