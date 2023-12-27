package kr.co.pomotime.user.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.annotations.ApiModelProperty;
import kr.co.pomotime.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Builder(toBuilder=true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@Column(name="UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "사용자key", example = "1")
	private int UID;
	
	@Column(name="email", length = 64, nullable = false)
	@ApiModelProperty(value = "사용자이메일", example = "abc@def.com")
	private String email;
	
	@Column(name="nickname", length = 16, nullable = false)
	@ApiModelProperty(value = "사용자nickname", example = "james")
	private String nickname;

	@Column(name="password", length = 64, nullable = false)
	@ApiModelProperty(value = "encodedPassword", example = "asdfafs")
	private String password;
	
	@Column(name="regDttm", updatable = false)
	@UpdateTimestamp
	private LocalDateTime regDttm;
	
	@Column(name="modDttm")
	@UpdateTimestamp
	private LocalDateTime modDttm;

	public UserDto toUserDto() {
		UserDto userDto = UserDto.builder()
				.UID(this.UID)
				.email(this.email)
				.nickname(this.nickname)
				.password(this.password)
				.regDttm(this.regDttm)
				.modDttm(this.modDttm)
				.build();
		return userDto;
	}
}
