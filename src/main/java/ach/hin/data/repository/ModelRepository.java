package ach.hin.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ach.hin.data.entity.Model;

public interface ModelRepository extends PagingAndSortingRepository<Model, Long> {

}
