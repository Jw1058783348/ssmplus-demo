package com.zving.ssmplus.entity;

import lombok.*;

/**
 * @Author JiangWei
 * @Email jiangwei@zving.com
 * @Date 2020/12/24
 * @Description
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	private Long ID;
	private String UserName;
	private String Password;

}
