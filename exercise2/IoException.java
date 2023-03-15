package ioexception;

import java.io.IOException;

public class IoException {
	static void throwmethod(){
		throw new IOException();
	}
	public static void main(String[] args) {
		throwmethod();
		System.out.println("ENd");
	}
}
