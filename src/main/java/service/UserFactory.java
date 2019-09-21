package service;

import model.EmployeeModel;

public class UserFactory {

  public EmployeeModel getDefaultEmployee() {
    EmployeeModel employeeModel = new EmployeeModel();
    return employeeModel;
  }
}
