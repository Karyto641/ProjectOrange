#Test project
#20/09/2021
#Lilibeth Carolina Ayala Ferro
@Regresion
Feature: enter orange

  @Caso1
  Scenario Outline: enter orange
    Given open the browser
    When enter username <userName> and the password <password>
    And close browser

    Examples: 
      | userName | password |
      | Admin    | admin123 |

  @Caso2
  Scenario Outline: create an employee
    Given open the browser
    When enter username <userName> and the password <password>
    And access the addemployee option
    Then fill out the fields first name <firstName> and last name <lastName>
    And close browser

    Examples: 
      | userName | password | firstName         | lastName |
      | Admin    | admin123 | Lilibeth Carolina | Ayala    |

  @Caso3
  Scenario Outline: Search Employee
    Given open the browser
    When enter  username <userName> and the password <password>
    And position on the form Employee Information and search Employee <employeeName>
    And close browser

    Examples: 
      | userName | password | employeeName      |
      | Admin    | admin123 | Lilibeth Carolina |

  @Caso4
  Scenario Outline: Lists
    Given open the browser
    When enter username <userName> and the password <password>
    Then select sub unit list <subUnit>
    And look in the table <nameSearch> select action <actions>
    And close browser

    Examples: 
      | userName | password | subUnit         | nameSearch  | actions |
      | Admin    | admin123 | Human Resources | Garry White | Reject  |

  @Caso5
  Scenario Outline: Calendar
    Given open the browser
    When enter username <userName> and the password <password>
    Then enter start date <dateInit> and enter finish date <dateFinish>
    And close browser

    Examples: 
      | userName | password | dateInit   | dateFinish |
      | Admin    | admin123 | 2020-01-01 | 2021-09-23 |
