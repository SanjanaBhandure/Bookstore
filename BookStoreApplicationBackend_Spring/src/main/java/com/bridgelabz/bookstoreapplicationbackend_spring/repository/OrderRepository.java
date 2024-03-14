package com.bridgelabz.bookstoreapplicationbackend_spring.repository;

import com.bridgelabz.bookstoreapplicationbackend_spring.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>
{

	Optional<OrderEntity> findByUserId(long id);

	@Query(value = "SELECT * FROM orders WHERE user_id=:id",nativeQuery = true)
	List<OrderEntity> getAllOrdersForUser(long id);

		

}
