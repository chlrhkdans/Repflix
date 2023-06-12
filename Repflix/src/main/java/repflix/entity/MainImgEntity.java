package repflix.entity;

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
public class MainImgEntity {
	
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String imgFile;
	
	@Column(nullable = false)
	private String description;
}
