package com.agilePeople.SimpleInterest.repository;

import com.agilePeople.SimpleInterest.entity.Personal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonalRepository extends CrudRepository<Personal, Long> {

}
