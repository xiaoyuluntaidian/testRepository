package cn.xiaoyuluntaidian.Service;

import cn.xiaoyuluntaidian.dao.DepartmentDao;
import cn.xiaoyuluntaidian.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class DepartmentService {


    @Autowired
    private DepartmentDao departmentDao;


    public Collection<Department> getDepartments(){
        return departmentDao.getDepartments();
    }


}
