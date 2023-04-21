package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exceptions.InvalidNoteIdException;
import model.Note;


public class NoteServiceImpl implements NoteService {

	
		//Note note = new Note();
	List<Note> notes;
	public NoteServiceImpl() {
		notes = new ArrayList<>();
	}
	
	

	@Override
	public void createNote(Note note) {
		//NUll
		notes.add(note);
		System.out.println("One note is created");
		
	}

	@Override
	public void readNote() {
		// TODO Auto-generated method stub
		System.out.println("Notes Available Collection");
		notes.forEach(System.out::println);
		
	}

	@Override
	public void updateNote(Note note) {
		//NUll
		
		System.out.println("Notes is updated");
		
	}

	@Override
	public void deleteNote(int noteId) {
		boolean isFound=false;
		for(Note n:notes)
		{
			if(n.getNoteId()==noteId)
				isFound=true;
		}
		
			if(isFound)
			{
				Predicate<Note> p = note-> note.getNoteId()==noteId;
				notes.removeIf(p);
				System.out.println("Note deleted.");
				
			}
			else {
				
				throw new InvalidNoteIdException();
				
			}
		
	
}
	


}
