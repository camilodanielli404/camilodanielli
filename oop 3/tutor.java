package oop;

public class tutor extends usuario {

	private usuario[] users;

	public tutor(String nombre, int ci, usuario[] users) {
		super(nombre, ci);

	}

	public usuario[] getUsers() {
		return users;
	}

	public void setUsers(usuario[] users) {
		this.users = users;
	}
	
	

}
