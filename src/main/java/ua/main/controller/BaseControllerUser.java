package ua.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BaseControllerUser {

	@GetMapping("/")
	public String showHome(Model model) {
			List<String> listUsers = new ArrayList<>();
				listUsers.add("User" + 1);
				listUsers.add("User" + 2);
				listUsers.add("User" + 3);
				listUsers.add("User" + 4);
				listUsers.add("User" + 5);
				listUsers.add("User" + 6);
				listUsers.add("User" + 7);
				listUsers.add("User" + 8);
				listUsers.add("User" + 9);
				listUsers.add("User" + 10);

				model.addAttribute("newUser", listUsers);
		return "home";
	}
	
	@GetMapping("/{userList}")
	public String showUser(Model model,
			@PathVariable("userList") String userName) {
		model.addAttribute("listUser", userName);
		return "user";
	}
	
	@GetMapping("/{list}/profile")//{list} - ліст цю назву підставляю з forEach де var="list" 
	public String showProfile() {
	
		return "user";
	}
	
	
	//////////////////////////////////////////////////////
	@GetMapping("/admin")
	public String showAdmin() {
	
		return "admin";
	}

	@GetMapping("/admin/user/user2/list/munberuser/profile")
	public String showAdminUser() {
	
		return "admin/user2/list/munberuser/profile";
	}

	@GetMapping("/admin/user/user2/list/munberuser/profile/edit")
	public String showAdminInfoUserEdit() {
	
		return "admin/user/user2/list/munberuser/profile";
	}
	
	@GetMapping("/admin/user/user2/list/munberuser/profile/sendmail")
	public String showAdminInfoSendMail() {
	
		return "admin/user/user2/list/munberuser/profile/sendmail";
	}
}
