package cn.xiaoyuluntaidian.Service;

import cn.xiaoyuluntaidian.dao.EmployeeDao;
import cn.xiaoyuluntaidian.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class EmpService {

    @Autowired
    private EmployeeDao employeeDao;


    public Collection<Employee> getAll(){
        return employeeDao.getAll();
    }

    public void addEmp(Employee employee){
        employeeDao.save(employee);
    }

    public Employee findEmpbyId(int id){
        return employeeDao.get(id);
    }

    public void editorEmp(Employee employee){
        employeeDao.save(employee);
    }

    public void deleteEmp(int id){
        employeeDao.delete(id);
    }
}
