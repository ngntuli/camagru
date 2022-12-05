package com.ngntuli.social.repos;

import com.ngntuli.social.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
