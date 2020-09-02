package me.qinchao.demo;

import lombok.Data;

/**
 * Created by sulvto on 4/10/20.
 */
@Data
public class Task {
    private String id;
    private String a;
    private String b;
    private String c1;
    private String c2;
    private long startTime;
    private long endTime;
    private long runingTime;
}
