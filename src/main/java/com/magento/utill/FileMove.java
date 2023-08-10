//package com.magento.utill;
//
//import java.io.File;
//import java.io.IOException;
//
//
//import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//
//public class FileMove {
//	static Logger log = LogManager.getLogger(FileMove.class);
//
//	public static void moveFile(String src,String dest)
//	{
//		log.info("Move File Method called");
//
//		File souurecFile=new File(src);
//		File destinationFile=new File(dest);
//		
//		try {
//			FileUtils.copyDirectory(souurecFile, destinationFile);
//		} catch (IOException e1) {
//			log.info(e1);
//		}	}
//}
