package kr.co.pomotime.user.dto;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserDto {
	@ApiModelProperty(value = "사용자key", example = "1")
	private int UID;
	
	@ApiModelProperty(value = "사용자이메일", example = "abc@def.com")
	private String email;
	
	@ApiModelProperty(value = "사용자nickname", example = "james")
	private String nickname;

	@ApiModelProperty(value = "encodedPassword", example = "asdfafs")
	private String password;
	
	@ApiModelProperty(value = "regDttm", example = "asdfafs")
	private LocalDateTime regDttm;
	
	@ApiModelProperty(value = "modDttm", example = "asdfafs")
	private LocalDateTime modDttm;
}
