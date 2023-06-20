package repflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import repflix.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{


}
