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

		String value=null;
		try
		{
			File file=new File(path);
			BufferedReader reader=new BufferedReader(new FileReader(file));
			value=reader.readLine();
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return value;
	}
}
