package com.taoji666.Hr.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HrMapper {
    public List<FOC> getEmpAll(); //获取所有员工的所有信息，返回到人力界面
    public List<Emp> getFocUser();; //获取运控中心员工的ID，密码，部门信息，用于登录验证
    public List<Emp> getMaintenUser(); //获取维修中心员工的ID，密码，部门信息，用于登录验证
    public List<Emp> getTgUser();//获取技术组员工的ID，密码，部门信息，用于登录验证
    public List<Emp> getPpcUser();//获取生产计划中心员工的ID，密码，部门信息，用于登录验证
    public List<Emp> getHrUser(); //获取人力中心员工的ID，密码，部门信息，用于登录验证
}
