package com.github.calebgg.gymbook_backend.repository;

import com.github.calebgg.gymbook_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
