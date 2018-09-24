package me.qinchao.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sulvto on 9/21/18.
 */
@Entity
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // 用户头像
    private String img;

    // 用户名
    private String username;

    // 手机号
    private String phoneNumber;

    // 邮箱
    private String email;
    // 所属用户组
//    private Group group;
    // 状态
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
