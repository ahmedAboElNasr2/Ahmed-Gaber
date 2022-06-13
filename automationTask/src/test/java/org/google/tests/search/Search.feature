Feature: Search Functionality

  Scenario: Search page UI elements
    When website is opened
    Then search button should be displayed
    And Google search button should be displayed
    And Iam Feeling Lucky button should be displayed
    And Search by voice button should be displayed

  @Regression
  Scenario Outline: Search for a keyword
    When website is opened
    And search for "<searchQuery>"
    Then "<searchQuery>" should be disaplyed in search result Page
    Examples:
      | searchQuery          |
      | trees                |
      | software engineering |
      | شجرة                 |

  @Regression
  Scenario Outline: Search with a mathematics equation
    When website is opened
    And search for "<searchQuery>"
    Then Calculator Section should be displayed in the result page
    Then "<equationAnswer>" should be displayed in search Calculator bar
    Examples:
      | searchQuery | equationAnswer |
      | 2+2         | 4              |
      | 5*5         | 25             |


  Scenario Outline: Search with wrong keyword
    When website is opened
    And search for "<searchQuery>"
    Then "<correctedKeyword>" should be displayed in search result page
    When click on the corrected keyword link
    Then "<correctedKeyword>" should be disaplyed in search result Page
    Examples:
      | searchQuery | correctedKeyword |
      | linel messi | lionel messi     |
      | treee       | tree             |











