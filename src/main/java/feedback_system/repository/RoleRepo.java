package feedback_system.repository;

import feedback_system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    //Role findByName(String name);

    Role findByUserId(long userId);
}