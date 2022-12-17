package com.udacity.dogmsaclient.repository;

import com.udacity.dogmsaclient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
