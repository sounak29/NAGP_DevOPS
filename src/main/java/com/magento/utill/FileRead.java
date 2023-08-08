package com.magento.utill;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileRead {

	static Logger log = LogManager.getLogger(FileRead.class);

	public static String readFile(String path) 
	{
		log.info("Read File Method called");
		BufferedReader reader = null;
		String value=null;
		try
		{
			File file=new File(path);
			reader=new BufferedReader(new FileReader(file));
			value=reader.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
}
