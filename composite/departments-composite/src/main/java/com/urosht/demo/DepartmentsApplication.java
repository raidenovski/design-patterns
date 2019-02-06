package com.urosht.demo;

import com.urosht.demo.component.Department;
import com.urosht.demo.component.composite.HeadDepartment;
import com.urosht.demo.component.leaf.FinancialDepartment;
import com.urosht.demo.component.leaf.SalesDepartment;

public class DepartmentsApplication {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1, "Sales Department");
        Department financialDepartment = new FinancialDepartment(2, "Financial Department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
