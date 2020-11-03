package me.qinchao.example.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by sulvto on 01/09/2020.
 *
 * @author sulvto
 */
@Data
@Table(name = "user")
public class User {
    private String username;

    private int password;

    @Column(name = "gmt_create")
    private Date gmtCreate;

    @Column(name = "gmt_modified")
    private Date gmtModified;
}
