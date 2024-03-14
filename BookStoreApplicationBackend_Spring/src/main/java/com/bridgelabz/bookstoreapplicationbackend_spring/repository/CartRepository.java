package com.bridgelabz.bookstoreapplicationbackend_spring.repository;

import com.bridgelabz.bookstoreapplicationbackend_spring.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<CartEntity, Long> {

	Optional<CartEntity> findByBookId(long bookId);
	
	Optional<CartEntity> findByUserId(long id);

//	@Query(value = "SELECT * FROM cart WHERE user_id=:id",nativeQuery = true)
//	List<CartEntity> getAllOrdersForUser(long id);

	List<CartEntity> findAllByuserId(long id);

}
