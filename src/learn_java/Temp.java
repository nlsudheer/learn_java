package learn_java;

import java.util.Scanner;  
import java.util.regex.Pattern;  
import java.util.regex.Matcher;  
import java.util.regex.PatternSyntaxException;  

import javax.crypto.*;

public class Temp {  

	public static void main(String[] args) {  
		String runConfigPath =System.getProperty("runConfig") ;
		String sRunConfigFile=System.getProperty ("user.dir")+"/src/main/resources/config/runconfig.properties";
		
		System.out.println("runConfigPath "+ runConfigPath );
		System.out.println( "sRunConfigFile " + sRunConfigFile );
		
		//String[] names = getCryptoImpls("Cipher"); 
	}  
}  