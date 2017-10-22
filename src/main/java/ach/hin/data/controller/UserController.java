package ach.hin.data.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ach.hin.data.entity.User;
import ach.hin.data.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/hello-world")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Set<User> sayHello(
			@RequestParam(value = "number", required = false, defaultValue = "1") Integer number) {
		switch (number) {
		case 1:
			log.debug("findUsers");
			Set<User> findUsers = userService.findUsers();
//			for (User user : findUsers) {
//				Set<User> friends = user.getFriends();
//				for (User friend : friends) {
//					log.debug(friend.getName());
//				}
//			}
			return findUsers;
		case 2:
			log.debug("findUsersWithCars");
			Set<User> findUsersWithCars = userService.findUsersWithCars();
			return findUsersWithCars;
		case 3:
			log.debug("findUsersWithCarsAndFriends");
			Set<User> findUsersWithCarsAndFriends = userService.findUsersWithCarsAndFriends();
			return findUsersWithCarsAndFriends;
		case 4:
			log.debug("findUsersWithCarsModelsAndFriends");
			Set<User> findUsersWithCarsModelsAndFriends = userService.findUsersWithCarsModelsAndFriends();
			return findUsersWithCarsModelsAndFriends;
		default:
			break;
		}
		return null;
	}

}
