package repflix.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Entity
public class GradeEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private Integer id;
	
	@ColumnDefault("0")
	@Column(nullable = false)
	private Float grade;
	
	@ManyToOne
	@JoinColumn(name="listId")
	private ListEntity listEntity;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private UserEntity userEntity;
	
	
}
