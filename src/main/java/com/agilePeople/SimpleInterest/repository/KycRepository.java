package com.agilePeople.SimpleInterest.repository;

import com.agilePeople.SimpleInterest.entity.Kyc;
import com.agilePeople.SimpleInterest.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KycRepository extends CrudRepository<Kyc, Long> {

}
