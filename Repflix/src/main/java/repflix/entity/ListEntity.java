package repflix.entity;


import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@DynamicInsert
@DynamicUpdate
public class ListEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(nullable = false)
	private Integer id;
	
	@Column(nullable = false)
	private String video;
	
	@Column(nullable = false) 
	private String title;
	
	@Column(nullable = false)
	private String description;
	
	@ColumnDefault("0")
	@Column(nullable = false) 
	private Float gradeAvr;
	
	@Column(nullable = false) 
	private String img;
}
