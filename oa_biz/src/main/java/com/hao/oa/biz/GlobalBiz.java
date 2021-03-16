package com.hao.oa.biz;

import com.hao.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn,String password);
    void changePassword(Employee employee);
}
