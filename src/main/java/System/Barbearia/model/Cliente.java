package System.Barbearia.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Cliente")
public class Cliente {
      
      @Id
      @GeneratedValue(strategy= GenerationType.AUTO)
      private Long id;
      private String name;
      private String phone;
      private String email;
      private String password;
      private Date bornDate;
      
}
