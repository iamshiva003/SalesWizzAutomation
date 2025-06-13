Feature: Automating SalesWizz Application

  Scenario: Automates SalesWizz Application to create catalogue and add product
    Given User sets up the driver

    When User opens and login to saleswizz application
      | phoneNumber | 8867509576 |

    And User creates catalogue group
      | groupName | 25k |
#
    And User creates catalogue
      | catalogue | Chain |

    Then User adds the product
      | productTitle       | Luffy               |
      | productDescription | King of the Priates |
      | productSKU         | 1                   |
      | productUOM         | 10                  |
      | productTag         | Anime               |
      | orderValue         | 500                 |
      | orderDate          | 02/06/2025          |
