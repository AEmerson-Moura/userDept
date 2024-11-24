package com.minha_api_rest.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minha_api_rest.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
