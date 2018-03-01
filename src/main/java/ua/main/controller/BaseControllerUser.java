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
				listUsers.add("User1");
				listUsers.add("User2");
				listUsers.add("User3");
				listUsers.add("User4");
				listUsers.add("User5");
				listUsers.add("User6");
				listUsers.add("User7");
				listUsers.add("User8");
				listUsers.add("User9");
				listUsers.add("User10");

				model.addAttribute("newUser", listUsers);
		return "home";
	}
	
	@GetMapping("/{userList}")
	public String showUser(Model model,
			@PathVariable("userList") String userName) {
		model.addAttribute("listUser", userName);
		return "/user";
	}
	
	@GetMapping("/{listUser}/profile")//{list} - ліст цю назву підставляю з forEach де var="list" 
	public String showProfile() {
	
		return "/user/profile";
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
