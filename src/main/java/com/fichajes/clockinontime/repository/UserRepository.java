package com.fichajes.clockinontime.repository;

import com.fichajes.clockinontime.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    User save(User user);
    void deleteByUsername(String username);
}
