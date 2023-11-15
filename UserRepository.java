package Repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

// UserRepository.java
public interface UserRepository extends JpaRepository<User, Long> {
}
