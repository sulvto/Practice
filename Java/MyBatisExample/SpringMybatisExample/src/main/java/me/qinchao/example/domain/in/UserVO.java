package me.qinchao.example.domain.in;

import lombok.Data;

import java.util.Date;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: UserVO.java, v0.1 02/09/2020 14:19 sulvto Exp$$
 */
@Data
public class UserVO {
    private String username;
    private Integer password;
    private Date gmtCreate;
    private Date gmtModified;
}
