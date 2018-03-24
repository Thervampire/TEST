package com.sxt.vo;

import com.sxt.pojo.Student;

import java.util.Arrays;

public class StudentVo extends Student {

    //爱好的数组
    private String[] hobbys;

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "hobbys=" + Arrays.toString(hobbys) +
                '}';
    }
}
