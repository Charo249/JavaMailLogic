package dto;

public class BookDTO {
	private String name;
	private String mail;

	
	
	public BookDTO(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}

