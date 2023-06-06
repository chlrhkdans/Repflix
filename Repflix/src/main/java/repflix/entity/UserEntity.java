package repflix.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@DynamicInsert
@DynamicUpdate
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;
	
	
	@Column(unique = true, nullable  = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	@ColumnDefault("ROLE_USER")
	private String role;
	
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime createDate;
	
	@Column(nullable = false)
	private Integer phoneNumber;
	
	@Column
	private Boolean withDrawal;
	
	@Column(nullable = false)
	private Boolean gender;
}
