package org.twinnation.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;


public final class TwinUtilities {

	private TwinUtilities(){}


	public static String getFileContents(String fullPath) {
		String contents = "";
		try {
			contents = new String(Files.readAllBytes(Paths.get(fullPath)));
		} catch (IOException e) {
			System.out.println("Unable to convert file to string: "
					+ e.getMessage());
		}
		return contents;
	}


	public static Document string2Document(String contents) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		Document document = null;
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(new InputSource(new StringReader(contents)));
			document.getDocumentElement().normalize();
		} catch (Exception e) {
			System.out.println("Unable to convert string to Document: "
					+ e.getMessage());
		}
		return document;
	}


	public static boolean writeInFile(String data, String fName, boolean append) {
		try {
			PrintWriter out = 
					new PrintWriter(new BufferedWriter(
					new FileWriter(fName, append)));
			out.println(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (new File(fName).exists());
	}


	public static boolean isInList(String[] haystack, String needle) {
		for(String s: haystack) {
			if (s.equals(needle)) { return true; }
		}
		return false;
	}
	

	public static boolean isInString(String haystack, String needle) {
		return (haystack.indexOf(needle) >= 0);
	}
	

	public static boolean isNull(Object o) {
		if (o == null || (o+"").equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	

	public static String sha512Salted(String password, String salt) {
		StringBuilder sb = new StringBuilder();
		try {
      MessageDigest md = MessageDigest.getInstance("SHA-512");
      md.update(salt.getBytes("UTF-8"));
      byte[] bytes = md.digest(password.getBytes("UTF-8"));
      for (int i = 0; i<bytes.length; i++){
         sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString()+":"+salt;
	}
	

	public static String getSalt() {
		byte[] salt = new byte[24];
		SecureRandom sr = new SecureRandom();
		sr.nextBytes(salt);
		return Base64.getEncoder().encodeToString(salt);
	}
	

	public static boolean validateSha512Salted(String password, String hashSalt) {
		String salt = hashSalt.split(":")[1];
		return sha512Salted(password, salt).equalsIgnoreCase(hashSalt);
	}
	

	public static int randomInteger(int min, int max) {
		return (int)((Math.random()*(max-min+1)+min));
	}

	public static String chars2String(char[] c) {
		String str = "";
		int x = 0;
		while (x <= c.length-1) {
			str += ""+c[x++];
		}
		return str;
	}


	public static String base64encode(byte[] b) {
		return Base64.getEncoder().encodeToString(b);
	}
	
	
	public static String base64encode(String s) {
		return Base64.getEncoder().encodeToString(s.getBytes());
	}
	

	public static String base64decode(byte[] b) {
		String decodedString = "";
		try {
			decodedString = new String(Base64.getDecoder().decode(b), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return decodedString;
	}
	
	
	public static String base64decode(String s) {
		String decodedString = "";
		try {
			decodedString = new String(Base64.getDecoder().decode(s.getBytes()), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return decodedString;
	}

}
