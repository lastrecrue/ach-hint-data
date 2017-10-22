package ach.hin.data;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ach.hin.data.entity.Car;
import ach.hin.data.entity.User;
import ach.hin.data.service.UserService;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceIT {

	@Autowired
	private UserService userService;

	@Test
	public void findUsers() {
		Set<User> users = userService.findUsers();
		for (User user : users) {
			log.debug(user.getName());
			Set<Car> cars = user.getCars();
			for (Car car : cars) {
				log.debug(car.getRegistrationNumber());
			}
		}
	}

	@Test
	public void findUsersWithCars() {
		userService.findUsersWithCars();
	}

	@Test
	public void findUsersWithCarsAndFriends() {
		userService.findUsersWithCarsAndFriends();
	}

	@Test
	public void findUsersWithCarsModelsAndFriends() {
		userService.findUsersWithCarsModelsAndFriends();
	}
}
