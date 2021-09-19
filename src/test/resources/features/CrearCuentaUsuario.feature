Feature:Creación de cuenta de usuario
  Como usario
  Quiero crea una cuenta en www.automationpractice.com



  @ScenarioCrearCuentadeUsuario
   Scenario Outline: Creacion de una cuenta de Usario
    Given Henoc esta en la pagina inicial de automationpractice
    When  Da clic en Sing Ing
    And   Ingresa el Email
          |<email>|
    And   Da clic en Create an account
    And   Rellena el formulario de registro your personal information

          |title  |firstname  |lastname  |email  |password  |
          |<title>|<firstname>|<lastname>|<email>|<password>|

    And   Rellena el formulario  direccion your address
          |company  |address  |address2  |city  |state  |postalCode  |country  |aditionalInformation  |homephone  |mobilephone  |addressalias  |
          |<company>|<address>|<address2>|<city>|<state>|<postalCode>|<country>|<aditionalInformation>|<homephone>|<mobilephone>|<addressalias>|
    And   Da clic en Register
    Then  Es llevado a la pagina MY ACCOUNT


    Examples:
      |title|firstname|lastname|email               |password  |dateofBirth  |company|address         |address2|city     |state     |postalCode|country      |aditionalInformation|homephone|mobilephone|addressalias|
      |Mr.  |Elias    |Amaya   |henocQA3@example.com|sergio1234|18-April-1988|Heam   |Cll 28 # 22 c 26|address2|Sincelejo|California|70001     |United States|ninguna             |2824569|3017049585   |Casa de Dios|




