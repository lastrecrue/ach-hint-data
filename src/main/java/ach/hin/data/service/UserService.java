package ach.hin.data.service;

import java.util.Set;

import ach.hin.data.entity.User;

public interface UserService {

	Set<User> findUsers();

	Set<User> findUsersWithCars();

	Set<User> findUsersWithCarsAndFriends();

	Set<User> findUsersWithCarsModelsAndFriends();


}
