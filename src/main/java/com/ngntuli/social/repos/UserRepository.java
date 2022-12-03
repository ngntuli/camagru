package com.ngntuli.social.repos;

import com.ngntuli.social.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
