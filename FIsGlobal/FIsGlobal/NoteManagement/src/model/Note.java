package model;

public class Note {
	
		private int noteId;
		private String author;
		private String  title;
		private String description;
		
		public Note()
		{
			
		}

		public Note(int noteId, String author, String title, String description) {
			super();
			this.noteId = noteId;
			this.author = author;
			this.title = title;
			this.description = description;
		}

		public int getNoteId() {
			return noteId;
		}

		public void setNoteId(int noteId) {
			this.noteId = noteId;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Note [noteId=" + noteId + ", author=" + author + ", title=" + title + ", description=" + description
					+ "]";
		}
		

	

}
