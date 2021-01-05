package me.qinchao.thrift.user.dto;

/**
 * Created by sulvto on 18-8-3.
 */
public class TeacherDTO extends UserDTO {
    private String intro;
    private int stars;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
