Feature: buyproduct

  Scenario Outline:add product to cart and remove in store
    Given that the user enters the page vivanda
    When  he adds the product from search bar:<product>
    And  Select the store:<store>
    Then  the product in the shopping cart
      | <product> |

    Examples:
      | product                                | store               |
      | Jamón de Pavita OTTO KUNZ Paquete 200g | Vivanda Dos de Mayo |


  Scenario Outline: add product to cart and select home delivery
    Given that the user enters the page vivanda
    When  he adds the product from search bar:<product>
    And  Select the District :<district>
    Then  the product in the shopping cart
      | <product> |
    Examples:
      | product                                | district    |
      | Jamón de Pavita OTTO KUNZ Paquete 200g | Jesus Maria |


  @Test1
  Scenario Outline:add product to cart and remove in store
    Given that the user enters the page vivanda
    When  he adds the product from page:<product>
    And  Select the store:<store>
    Then  the product in the shopping cart
      | <product> |

    Examples:
      | product                                | store               |
      | Jamón de Pavita OTTO KUNZ Paquete 200g | Vivanda Dos de Mayo |
