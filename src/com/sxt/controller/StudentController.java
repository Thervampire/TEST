package com.sxt.controller;

import com.sxt.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("student")//代表这个类的命名空间 用户请求应该使用user作为前缀
public class StudentController {

    @RequestMapping("add1")
    public String addStudent1(String name, String password) {
        System.out.println(name + "---" + password);
        return "../index.jsp";
    }

    @RequestMapping("add2")
    public String addStudent2(String name, String password, String[] hobby) {
        System.out.println(name + "---" + password + Arrays.toString(hobby));
        return "../index.jsp";
    }

    @RequestMapping("add3")
    public String addStudent3(Student vo) {
        System.out.println(vo);
        return "../index.jsp";
    }

    @RequestMapping("query")
    public ModelAndView query1() {
        ModelAndView mv = new ModelAndView();
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "阎良", "123", "PBUG"));
        students.add(new Student(2, "陈志强", "3333", "DNF"));
        mv.addObject("students", students);
        mv.setViewName("../index.jsp");
        return mv;
    }
}
