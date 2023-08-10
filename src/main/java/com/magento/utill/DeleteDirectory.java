//package com.magento.utill;
//
//import java.io.File;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//
//public class DeleteDirectory {
//	private static final Logger log = LogManager.getLogger(DeleteDirectory.class);
//    private DeleteDirectory() {
//        // Private constructor to prevent instantiation
//    }
//    
//    public static boolean deleteDirectory(File file) {
//        log.info("Delete Directory Method Called");
//        boolean success = false;
//        try {
//            for (File subfile : file.listFiles()) {
//                if (subfile.isDirectory()) {
//                    deleteDirectory(subfile);
//                }
//                success = subfile.delete();
//            }
//        } catch (Exception e) {
//            log.error("Error during directory deletion: " + e.getMessage());
//        }
//
//        if (success) {
//            log.info("Deletion of directory succeeded: " + file.getAbsolutePath());
//        } else {
//            log.error("Deletion of directory failed: " + file.getAbsolutePath());
//        }
//
//        return success;
//    }
//    
//    log.info("Delete Directory Method Called");
//    boolean success = deleteDirectory(file);
//    if (success) {
//        log.info("Deletion of directory succeeded: " + file.getAbsolutePath());
//    } else {
//        log.error("Deletion of directory failed: " + file.getAbsolutePath());
//    }
//
//
//	    
//
////	public static void deleteDirectory(File file)
////	{
////		log.info("Delete Directory Method Called");
////		boolean s=false;
////		for(File subfile : file.listFiles())
////		{
////			if(subfile.isDirectory())
////			{
////				deleteDirectory(subfile);
////			}
////			bool= subfile.delete();
////			 
////		}
////		log.info("Delete Directory Method Called");
////		if (success) {
////		    log.info("Deletion of directory succeeded: " + file.getAbsolutePath());
////		} else {
////		    log.error("Deletion of directory failed: " + file.getAbsolutePath());
////		}
//	}
//
//}
