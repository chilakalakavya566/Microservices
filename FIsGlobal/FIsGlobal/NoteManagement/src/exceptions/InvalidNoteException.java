/**
 * 
 */
package exceptions;


public class InvalidNoteException  extends RuntimeException{
	 InvalidNoteException()
	 {
		 super("There is no specified note in the list.");
	 }

}
