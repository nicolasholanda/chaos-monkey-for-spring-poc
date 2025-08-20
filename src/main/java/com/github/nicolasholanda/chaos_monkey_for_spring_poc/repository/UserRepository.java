package com.github.nicolasholanda.chaos_monkey_for_spring_poc.repository;

import com.github.nicolasholanda.chaos_monkey_for_spring_poc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
