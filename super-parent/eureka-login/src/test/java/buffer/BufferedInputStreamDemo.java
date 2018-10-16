package buffer;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	
	public static void main(String[] args) {
		String s ="This is a &copy; copyright symbol but this is &copy not,\n";
		int c ;
		boolean marked = false;
		ByteArrayInputStream bais = new ByteArrayInputStream(s.getBytes());
		
		try(FileInputStream fs = new FileInputStream("");BufferedInputStream bs = new BufferedInputStream(fs)){
			while((c = bs.read()) != -1) {
				switch(c) {
					case '&':
						if(!marked) {
							bs.mark(32);
							marked = true;
						}else {
							marked = false;
						}
						break;
					case ';':
						if(marked) {
							System.out.print("(c)");
							marked = false;
						}else {
							System.out.print((char)c);
						}
						break;
					case ' ':
						if(marked) {
							marked = false;
							bs.reset();
							System.out.print("!");
						}else {
							System.out.print((char)c);
						}
						marked = false;
						
						break;
					default:{
						if(!marked) {
							System.out.print((char)c);
						}
						
					}
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
