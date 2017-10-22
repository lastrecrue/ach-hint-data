package ach.hin.data.service.impl;

import java.util.Set;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ach.hin.data.entity.User;
import ach.hin.data.repository.UserRepository;
import ach.hin.data.service.UserService;

@Service
@Transactional(value=TxType.NEVER)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public Set<User> findUsers() {
		return userRepository.findUsers();
	}

	public Set<User> findUsersWithCars() {
		return userRepository.findUsersWithCars();
	}

	public Set<User> findUsersWithCarsAndFriends() {
		return userRepository.findUsersWithCarsAndFriends();
	}

	public Set<User> findUsersWithCarsModelsAndFriends() {
		return userRepository.findUsersWithCarsModelsAndFriends();
	}
}
