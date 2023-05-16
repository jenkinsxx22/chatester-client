package chatester.main;

import chatester.main.models.User;
import chatester.main.services.UserService;

public class MainTest {
	public static void main(String[] args) {
		
		User user = new User();
//		user.setFullName("Nisar Ahmed Abbasi");
//		user.setEmail("cengr.nisar.ahmed@gmail.com");
//		user.setPassword("123");
		UserService userservice = new UserService();
		userservice.Connect();
//		userservice.SaveUser(user);
//		
		user  = userservice.findUserByEmail("cengr.nisar.ahmed@gmail.com");
		System.out.println("Full Name:"+user.getFullName());
		System.out.println("Email:"+user.getEmail());
		System.out.println("Password:"+user.getPassword());
	}
}
