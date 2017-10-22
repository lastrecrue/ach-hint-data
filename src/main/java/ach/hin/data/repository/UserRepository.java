package ach.hin.data.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import ach.hin.data.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	@Query("select u from User u")
	Set<User> findUsers();

	@Query("select u from User u")
	@EntityGraph(attributePaths = { "cars" })
	Set<User> findUsersWithCars();

	@Query("select u from User u")
	@EntityGraph(attributePaths = { "cars", "friends" })
	Set<User> findUsersWithCarsAndFriends();

	@Query("select u from User u")
	@EntityGraph(attributePaths = { "cars.model", "friends" })
	Set<User> findUsersWithCarsModelsAndFriends();

}
