package System.Barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import System.Barbearia.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
      
}
