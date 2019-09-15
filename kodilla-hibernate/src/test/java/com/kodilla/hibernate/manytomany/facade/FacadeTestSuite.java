package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    CompanyFacade companyFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    EmployeeFacade employeeFacade;

    @Test
    public void testGetCompanyByPartOfName() {
        //Given
        Company company1 = new Company("company one");
        Company company2 = new Company("company two");
        Company company3 = new Company("company three");

        //When
        companyDao.saveAll(Arrays.asList(company1, company2, company3));
        int resultOne = companyFacade.findCompanyByPartOfName("one").size();
        int resultTwo = companyFacade.findCompanyByPartOfName("two").size();
        int resultThree = companyFacade.findCompanyByPartOfName("three").size();
        int resultCompany = companyFacade.findCompanyByPartOfName("company").size();

        //Then
        Assert.assertEquals(1, resultOne);
        Assert.assertEquals(1, resultTwo);
        Assert.assertEquals(1, resultThree);
        Assert.assertEquals(3, resultCompany);

        //CleanUp
        companyDao.deleteAll(Arrays.asList(company1, company2, company3));
    }

    @Test
    public void testGetEmployeeByPartOfName() {
        //Given
        Employee employee1 = new Employee("employee" , "one");
        Employee employee2 = new Employee("two", "employee");
        Employee employee3 = new Employee("employee", "three");

        //When
        employeeDao.saveAll(Arrays.asList(employee1, employee2, employee3));
        int resultOne = employeeFacade.findEmployeeByPartOfName("one").size();
        int resultTwo = employeeFacade.findEmployeeByPartOfName("two").size();;
        int resultThree = employeeFacade.findEmployeeByPartOfName("three").size();
        int resultEmployee = employeeFacade.findEmployeeByPartOfName("employee").size();

        //Then
        Assert.assertEquals(1, resultOne);
        Assert.assertEquals(1, resultTwo);
        Assert.assertEquals(1, resultThree);
        Assert.assertEquals(3, resultEmployee);

        //CleanUp
        employeeDao.deleteAll(Arrays.asList(employee1, employee2, employee3));
    }

}
