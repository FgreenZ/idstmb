package controllers;


public class AuthController {

	private AuthView login;
	
	public AuthController() {
		
		login=new AuthView();
		
	}
	
	public void login() {
		
		login.login();
		
	}
	
	public void prueba() {
		
		login.users();
		
	}
}
