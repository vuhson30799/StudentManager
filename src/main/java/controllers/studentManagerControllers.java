package controllers;

import models.FindForm;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.StudentManager;

import java.util.ArrayList;

@Controller
public class studentManagerControllers {
    @Autowired
    private StudentManager studentManager;
    @GetMapping(value = {"/list", "/"})
    public String list(Model model){
        model.addAttribute("students",studentManager.getListStudent());
        return "list";
    }

    @GetMapping("/view")
    public String view(@RequestParam(name = "id") String id,Model model){

        model.addAttribute("student",studentManager.findById(id));
        return "view";
    }
    @PostMapping("/input")
    public String input(@ModelAttribute(name = "student") Student student){

        studentManager.getListStudent().add(student);
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

        studentManager.getListStudent().remove(studentManager.findById(id));

        model.addAttribute("students",studentManager.getListStudent());
        return "list";
    }
    @GetMapping("/deleteForm")
    public String deleteForm(@RequestParam(name = "id") String id, Model model){
        model.addAttribute("student",studentManager.findById(id));
        return "deleteForm";
    }
    @GetMapping("/editForm")
    public String editForm(@RequestParam(name = "id")String id,Model model){
        model.addAttribute("student",studentManager.findById(id));
            return "editForm";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute(name = "student") Student student){

        studentManager.editInformation(student);
        return "view";
    }
    @PostMapping("/find")
    public String find(@ModelAttribute(name = "findForm")FindForm findForm, Model model){

        if (findForm.getId() != null) {
            model.addAttribute("student", studentManager.findById(findForm.getId()));
            return "view";
        } else {
            model.addAttribute("students",studentManager.findByName(findForm.getName()));
            return "viewListStudent";
        }

    }
    @GetMapping("/findForm")
    public String findForm(Model model){
        FindForm findForm= new FindForm();
        model.addAttribute("findForm",findForm);
        return "findForm";
    }
}
