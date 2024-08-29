
package com.agilePeople.SimpleInterest.repository;

import com.agilePeople.SimpleInterest.entity.FirstLogin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FirstLoginRepository  extends CrudRepository<FirstLogin, Long> {
    //@Query(nativeQuery=true , value="SELECT * FROM login where email=?1")
    Optional<FirstLogin> findByEmail(String email);

    Optional<FirstLogin> findByPhone(String phone);

    Optional<FirstLogin> findByPin(String pin);

    Optional<FirstLogin> findLoginByEmail(String email);
    Optional<FirstLogin> findLoginByEmailAndMpinAndActive(String email, String mpin, String Active);

    Optional<FirstLogin> findLoginByMobileAndMpinAndActive(String mobile, String mpin, String Active);;

}


