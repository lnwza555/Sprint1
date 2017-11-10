import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.junit.Test;

public class UploadTest {
	
	@Test
	public void checkingFiles() {
		assertTrue("No files",f.isFile());
	}
	
	@Test
	public void checkingUser(){
		try {
			BufferedReader read = new BufferedReader(new FileReader(f));
			BufferedReader read2 = new BufferedReader(new FileReader(f));
			String line = "";String line2 = "";
			while((line = read.readLine()) != null) {
				while((line2 = read2.readLine()) != null) {
					 assertFalse("Same data",line.equals(line2));
				} 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void checkingEmail(){
		try {
			BufferedReader read = new BufferedReader(new FileReader(f));
			int id; String name,lastname,email;
			String line = "";String line2 = "";
			while((line = read.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				id = Integer.parseInt(st.nextToken());
				name = st.nextToken();
				lastname = st.nextToken();
				email=st.nextToken();
				try{
					assertFalse("1 Student has 1 email",st.nextToken()!=null);
				}
				catch(Exception e){
					assertTrue(true);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			assertTrue(true);
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(true);
		}
	}
}
