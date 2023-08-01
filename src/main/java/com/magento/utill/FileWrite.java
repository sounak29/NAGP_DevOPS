package com.magento.utill;

import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileWrite {
	static Logger log = LogManager.getLogger(FileWrite.class);

	public static void writeFile(String value, String path)
	{
		log.info("Write File Method called");

		try
		{
			FileWriter writer=new FileWriter(path);
			writer.write(String.valueOf(value));
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
