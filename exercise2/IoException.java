package ioexception;

import java.io.IOException;
/**
 * 
 * @author nandhakumar
 *class IOexception
 *throws a new IOexception without any throws clause and try, catch block
 */
public class IoException{
	static void throwmethod(){
		throw new IOException();
	}
	public static void main(String[] args) {
		throwmethod();
		System.out.println("END");

	}
}
