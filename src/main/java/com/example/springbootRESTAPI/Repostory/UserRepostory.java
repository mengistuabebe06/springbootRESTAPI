package com.example.springbootRESTAPI.Repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootRESTAPI.Entity.User;

@Repository
public interface UserRepostory extends JpaRepository<User, Integer>{

}
