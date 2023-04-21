package exceptions;

public class InvalidNoteIdException extends RuntimeException{
	public InvalidNoteIdException()
	{
		super("There is no note with the given id.");
	}

}
