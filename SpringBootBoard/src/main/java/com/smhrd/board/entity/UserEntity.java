package com.smhrd.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data // getter / setter 
@Table(name="user") // 이미 만들어 놓은 DB 사용 할 수 없나요? , DB이름을 다르게 지정하고 싶어요
public class UserEntity {

	//pk 값이 필수 
	@Id //jakarta 사용할 것 -> pk로 사용하겠다
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increase
	private Long idx; // 객체타입으로 삽입 --> DB에 해당 값이 없으면 null로 값이 넘어옵니다.
	
	@Column(nullable = false, unique = true)
	private String id;
	private String pw;
	private String name;
	private Integer age;
	
	
}
