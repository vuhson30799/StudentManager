package controllers;

import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class studentManagerControllers {
    private List<Student> studentList = new ArrayList<>();
    private int Init_time = 0;
    public void init(){

        studentList.add(new Student("3007","Vũ Hoàng Sơn",19,"08 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("1234","Đàm Thị Dung",19,"09 Trần Quang Khải","Female","17T3"));
        studentList.add(new Student("5678","Tăng Văn Lộc",19,"10 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("9101","Phạm Văn Hoàng",19,"11 Trần Quang Khải","Male","17T3"));
        studentList.add(new Student("8080","Mai Tấn Sang",19,"12 Trần Quang Khải","Male","17T3"));
    }
    @GetMapping(value = {"/list", "/"})
    public String list(Model model){

        if (Init_time == 0){
            Init_time++;
            init();
        }
        model.addAttribute("students",studentList);
        return "list";
    }

    @GetMapping("/view")
    public String view(@RequestParam(name = "id") String id,Model model){
        for (Student x :
                studentList) {
            if (x.getId().equals(id)){
                model.addAttribute("student",x);
            }
        }
        return "view";
    }
    @PostMapping("/input")
    public String input(@ModelAttribute(name = "student") Student student){
        studentList.add(student);
        return "view";
    }
    @GetMapping("/inputForm")
    public ModelAndView inputForm(){
        Student student = new Student();
        ModelAndView modelAndView = new ModelAndView("inputForm","student",student);
        return modelAndView;
    }
    @PostMapping("/delete")
    public String delete(@RequestParam(name = "id") String id,Model model){
        boolean done = false;
        for (Student x :
                studentList) {
            if (x.getId().equals(id)){
               studentList.remove(x);
               done = true;
            }
        }
        if (!done){
            model.addAttribute("message","Delete Successfully!!");
        }
        model.addAttribute("students",studentList);
        return "list";
    }
    @GetMapping("/deleteForm")
    public String deleteForm(@RequestParam(name = "id") String id, Model model){
        for (Student x :
                studentList) {
            if (x.getId().equals(id)){
                model.addAttribute("student",x);
            }
        }
        return "deleteForm";
    }
    @GetMapping("/editForm")
    public String editForm(@RequestParam(name = "id")String id,Model model){
            for (Student x :
                    studentList) {
                if (x.getId().equals(id)){
                    model.addAttribute("student",x);
                }
            }
            return "editForm";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute(name = "student") Student student){
        for (Student x :
                studentList) {
            if (x.getId().equals(student.getId())){
                x.setName(student.getName());
                x.setAge(student.getAge());
                x.setAddress(student.getAddress());
                x.setSex(student.getSex());
                x.setStudentClass(student.getStudentClass());
            }
        }
        return "view";
    }
    @PostMapping("/find")
    public String find(@ModelAttribute(name = "student") Student student,Model model){
        String id = student.getId();
        boolean exist = false;
        if (id != null){
            for (Student x :
                    studentList) {
                if (x.getId().equals(id)){
                    model.addAttribute("student",x);
                    exist = true;
                }
            }
        }else {
            String name = student.getName();
            for (Student x :
                    studentList) {
                if (x.getName().equals(name)){
                    model.addAttribute("student",x);
                    exist = true;
                }
            }
        }
        if (!exist) {
            model.addAttribute("message","This student is not exist!!");
        }
        return "view";
    }
    @GetMapping("/findForm")
    public String findForm(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "findForm";
    }
}
