package com.socialy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialy.user.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
