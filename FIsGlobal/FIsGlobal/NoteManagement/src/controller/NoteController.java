package controller;

import java.util.Scanner;

import exceptions.InvalidNoteIdException;
import model.Note;
import service.NoteServiceImpl;

public class NoteController {
	public static void display()
	{
		System.out.println("Note Operations:");
		System.out.println("1.Create Note");
		System.out.println("2.Display Note");
		System.out.println("3.Update Note");
		System.out.println("4.Delete Note");
		System.out.println("5.Exit Menu");
		
	}

	public static void main(String[] args) {
		NoteServiceImpl service= new NoteServiceImpl();
		display();
		int choice;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter your choice");
		choice= sc.nextInt();
		while(choice!=5)
		{
			
		
		switch(choice)
		{
		
		case 1: 
			System.out.println("Enter Note id");
			int noteId = sc.nextInt();
			System.out.println("Enter title");
			String title = sc.nextLine();
			System.out.println("Enter Author");
			String author = sc.nextLine();
			System.out.println("Enter Description");
			String description = sc.nextLine();
			Note note = new Note(noteId,title,author,description);
			service.createNote(note);
			break;
		case 2: service.readNote();break;
		case 3: service.updateNote(null); break;
		case 4: 
			
			try {
				System.out.println("Enter Note id");
				int id = sc.nextInt();
				service.deleteNote(id);
				}
			catch(InvalidNoteIdException e)
			{
				System.out.println(e);
			}
			break;
		default : System.out.println("Wrong choice");
		}
		 sc =  new Scanner(System.in);
		 System.out.println("Enter your choice");
		 choice= sc.nextInt();
		
		
		
	}
	}

}
