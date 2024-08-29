package com.agilePeople.SimpleInterest.repository;

import com.agilePeople.SimpleInterest.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepository extends CrudRepository<State, Long> {

}
