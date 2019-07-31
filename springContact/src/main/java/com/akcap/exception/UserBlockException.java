package com.akcap.exception;

public class UserBlockException extends Exception{
	/*create user Exception without error description
	 * 
	 * */
 public UserBlockException() {
	 
     }
 /*create user Exception with error description
	 * 
	 * */
   public UserBlockException(String errDes) {
	   super(errDes);
   }
}
