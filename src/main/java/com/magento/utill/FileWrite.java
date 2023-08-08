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
		FileWriter writer=null;
		try
		{
			 writer=new FileWriter(path);
			writer.write(String.valueOf(value));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch ( NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
