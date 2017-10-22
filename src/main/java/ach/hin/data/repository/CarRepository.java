package ach.hin.data.repository;

import ach.hin.data.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarRepository extends PagingAndSortingRepository<User, Long> {

}
