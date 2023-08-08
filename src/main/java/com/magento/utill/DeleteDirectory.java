package com.magento.utill;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DeleteDirectory {
	   private DeleteDirectory() {
	    }
	    
	 static Logger log = LogManager.getLogger(DeleteDirectory.class);

	public static void deleteDirectory(File file)
	{
		log.info("Delete Directory Method Called");
		boolean bool=false;
		for(File subfile : file.listFiles())
		{
			if(subfile.isDirectory())
			{
				deleteDirectory(subfile);
			}
			bool= subfile.delete();
			 
		}
		if(bool)
		{
			System.out.print("sucess");
		}
		else
		{
			System.out.print("fail");

		}
		
	}

}
