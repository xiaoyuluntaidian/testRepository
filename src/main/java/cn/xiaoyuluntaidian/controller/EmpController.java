package cn.xiaoyuluntaidian.controller;

import cn.xiaoyuluntaidian.Service.DepartmentService;
import cn.xiaoyuluntaidian.Service.EmpService;
import cn.xiaoyuluntaidian.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmpService service;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/emps")
    public String getEmps(Map<String,Object> map){
        map.put("emps",service.getAll());
        return "emp/list";
    }

    @GetMapping("/emp")
    public String turnToList(Map<String,Object> map){
        map.put("departs",departmentService.getDepartments());
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        service.addEmp(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String editorEmpPage(@PathVariable("id") Integer id, Model model){
        model.addAttribute("emp",service.findEmpbyId(id));
        return "forward:/emp";
    }

    @PutMapping("/emp")
    public String editorEmp(Employee employee){
        service.addEmp(employee);
        System.out.println("123");
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        service.deleteEmp(id);
        System.out.println(1231232131);
        return "redirect:/emps";
    }
}
