package com.bridgelabz.bookstoreapplicationbackend_spring.repository;


import com.bridgelabz.bookstoreapplicationbackend_spring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserEntity,Long> {

	Optional<UserEntity> findByEmailId(String emailId);

	Optional<UserEntity> findByEmailIdAndPassword(String emailId, String password);

}
