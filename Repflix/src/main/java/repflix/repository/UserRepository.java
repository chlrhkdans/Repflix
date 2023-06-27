package repflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import repflix.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{


}
