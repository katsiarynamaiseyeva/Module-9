package model;

import java.util.Objects;

public class EmployeeModel {

  private String EIN;
  private int socialSecurity;
  private String birthday;
  private String username;
  private String employeeId;
  private String firstName;
  private String lastName;
  private String dateHired;
  private String dateStarted;
  private String unemploymentState;

  public String getEIN() {
    return EIN;
  }

  public void setEIN(String EIN) {
    this.EIN = EIN;
  }

  public int getSocialSecurity() {
    return socialSecurity;
  }

  public void setSocialSecurity(int socialSecurity) {
    this.socialSecurity = socialSecurity;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDateHired() {
    return dateHired;
  }

  public void setDateHired(String dateHired) {
    this.dateHired = dateHired;
  }

  public String getDateStarted() {
    return dateStarted;
  }

  public void setDateStarted(String dateStarted) {
    this.dateStarted = dateStarted;
  }

  public String getUnemploymentState() {
    return unemploymentState;
  }

  public void setUnemploymentState(String unemploymentState) {
    this.unemploymentState = unemploymentState;
  }

  @Override
  public String toString() {
    return "EmployeeModel{"
        + "EIN='"
        + EIN
        + '\''
        + ", socialSecurity="
        + socialSecurity
        + ", birthday='"
        + birthday
        + '\''
        + ", username='"
        + username
        + '\''
        + ", employeeId='"
        + employeeId
        + '\''
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", dateHired='"
        + dateHired
        + '\''
        + ", dateStarted='"
        + dateStarted
        + '\''
        + ", unemploymentState='"
        + unemploymentState
        + '\''
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeeModel that = (EmployeeModel) o;
    return socialSecurity == that.socialSecurity
        && Objects.equals(EIN, that.EIN)
        && Objects.equals(birthday, that.birthday)
        && Objects.equals(username, that.username)
        && Objects.equals(employeeId, that.employeeId)
        && Objects.equals(firstName, that.firstName)
        && Objects.equals(lastName, that.lastName)
        && Objects.equals(dateHired, that.dateHired)
        && Objects.equals(dateStarted, that.dateStarted)
        && Objects.equals(unemploymentState, that.unemploymentState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        EIN,
        socialSecurity,
        birthday,
        username,
        employeeId,
        firstName,
        lastName,
        dateHired,
        dateStarted,
        unemploymentState);
  }
}
