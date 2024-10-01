package System.Barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import System.Barbearia.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long>{
      
}
