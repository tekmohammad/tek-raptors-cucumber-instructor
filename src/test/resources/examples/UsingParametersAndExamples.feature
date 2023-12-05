Feature: Usage of Steps with parameters and Examples.

  Scenario: Students on exam
    When student "Mohammad" take exam

  Scenario: All Students.
    When student "John" take exam
    When student "Murtaza" take exam
    When student "Alex" take exam

  Scenario: Login Step
    When user enter username as "mohammad" and password as "mohammad123"
    When user have 25 notification

  Scenario Outline: Login with multiple users
    When user enter username as "<username>" and password as "<password>"
    When user have <count> notification
    Examples:
      | username | password    | count |
      | mohammad | mohammad123 | 26    |
      | john     | john123     | 34    |
      | alex     | alex123     | 78    |

    #Scenario that John, Alex and Mohammad going to school with car
  #When multiple scenarios using same exact steps with different
  #Those scenarios can simplify with Scenario Outline and Examples.
  #Scenario outline must have Examples following
  #First row of example is key for column header
  #The rows after will be the Data.
  #Cucumber will execute entire scenario for each row of Examples provided
  Scenario Outline: Students going to school with car
    Given start my car
    When student "<name>" drive to school
    Then student "<name>" arrive to school
    Examples:
      | name     |
      | Mohammad |
      | John     |
      | Alex     |
      | Murtaza  |
      | Mursal   |
      | Gulzai   |


