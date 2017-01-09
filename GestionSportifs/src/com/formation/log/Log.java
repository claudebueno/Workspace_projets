package com.gestionsportif.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
	private final static String FILENAME="log.txt";
	private final static String CHEMIN="C:\\fichierslog\\";
	private static SimpleDateFormat formater = null;
	public static void write(String message) {	
		message = getMessage(message);
		writeFile(message);
	}
	public static void write(String message,String erreur) {
		message = getMessage(message,erreur);
		writeFile(message);
	}
	private static String getMessage(String message) {
		Date today = new Date();
		formater = new SimpleDateFormat("[dd/MM/yyyy hh:mm:ss]");
		return formater.format(today)+" "+message;
	}
	private static String getMessage(String message, String erreur) {
		Date today = new Date();
		formater = new SimpleDateFormat("[dd/MM/yyyy hh:mm:ss]");
		return formater.format(today)+" ["+ erreur +"] "+message;
	}
	private static void writeFile(String message) {
		File f = new File(CHEMIN+"//"+FILENAME);
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(message+"\r\n");
			fw.flush();
			fw.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(message);
	}
}