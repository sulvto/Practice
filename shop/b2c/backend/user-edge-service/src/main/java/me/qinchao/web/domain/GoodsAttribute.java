package me.qinchao.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by sulvto on 9/24/18.
 */
@Entity
public class GoodsAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int sort;
    private boolean enable;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
