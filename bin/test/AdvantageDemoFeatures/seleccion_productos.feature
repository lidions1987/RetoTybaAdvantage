#Author: diego.arboledabr@gmail.com

@tag
Feature: Registro de cuenta nueva en el sitio web "advantageonlineshopping.com/"
  Yo como un cliente potencial requiero registrarme en el sitio web de "advantageonlineshopping.com/" para poder realizar mis compras.

  @tag1
  Scenario: Campo de texto Username solo debe permitir como maximo el ingreso de quince caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Username <Diego AlexanderB>
    Then yo puedo validar un mensaje de texto <Use maximum 15 character>
    
  
   @tag2 
   Scenario: Campo de texto Username solo debe permitir como minimo el ingreso de cinco caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Username <Dieg>
    Then yo puedo validar un mensaje de texto <Use  5 character or longer>   
    
    
   @tag3 
   Scenario: validación campo Username cuando se encuentra vació.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And click en el campo Username 
    Then yo puedo validar un mensaje de texto <Username field is required>  
    
    
     
  @tag4
    Scenario: Campo de texto Password solo debe permitir como maximo el ingreso de doce caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Password <Diego Alexand>
    Then yo puedo validar un mensaje de texto <Use maximum 12 character>
    
  
   @tag5 
   Scenario: Campo de texto Password solo debe permitir como minimo el ingreso de cuatro caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Password <Die>
    Then yo puedo validar un mensaje de texto <Use  4 character or longer>   
    
    
   @tag6 
   Scenario: validación campo Password cuando se encuentra vació.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And click en el campo Password 
    Then yo puedo validar un mensaje de texto <Password field is required> 
    
   @tag7 
   Scenario: validación campo Password tenga almenos una palabra en Mayuscula.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Password <diego1>
    Then yo puedo validar un mensaje de texto <One upper letter required> 
    
    
   @tag8 
   Scenario: validación campo Password tenga almenos una número.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Password <Diego>
    Then yo puedo validar un mensaje de texto <One number required>
    
    
   @tag9 
   Scenario: validación campo Confirm Password cuando no coincida con el campo Password.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Password <Diego1>
    And Igreso en el campo Confirm Password <Diego2>
    Then yo puedo validar un mensaje de texto <Passwords do not match>
    
    
   @tag10 
   Scenario: validación campo Confirm Password cuando se encuentra vació.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And click en el campo Confirm Password 
    Then yo puedo validar un mensaje de texto <Confirm password field is required> 
    
    
   
    @tag11
    Scenario: Campo de texto First name solo debe permitir como maximo el ingreso de treinta caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo First name <Diego Alexander Arboleda Bran A>
    Then yo puedo validar un mensaje de texto <Use maximum 30 character>
    
  
   @tag12 
   Scenario: Campo de texto First name solo debe permitir como minimo el ingreso de dos caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
   And ingreso en el campo First name <D>
    Then yo puedo validar un mensaje de texto <Use 2 character or longer>
    
    
    @tag13
    Scenario: Campo de texto last name solo debe permitir como maximo el ingreso de treinta caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo last name <Diego Alexander Arboleda Bran B>
    Then yo puedo validar un mensaje de texto <Use maximum 30 character>
    
  
   @tag14 
   Scenario: Campo de texto First name solo debe permitir como minimo el ingreso de dos caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
   And ingreso en el campo last name <A>
    Then yo puedo validar un mensaje de texto <Use 2 character or longer>
    
          
    @tag15
    Scenario: Campo de texto Phone Number solo debe permitir como maximo el ingreso de veinte caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Phone Number <300000000000000000000>
    Then yo puedo validar un mensaje de texto <Use maximum 20 character>
    
    @tag16
    Scenario: Campo de texto City solo debe permitir como maximo el ingreso de veinticinco caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo City <Colooooombiaaaaaaaaaaaaaaa>
    Then yo puedo validar un mensaje de texto <Use maximum 25 character>
    
    @tag17
    Scenario: Campo de texto Address solo debe permitir como maximo el ingreso de cincuenta caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Address <calle 55 numero 07 88 apt 201 unidad residencial bl>
    Then yo puedo validar un mensaje de texto <Use maximum 50 character>
    
    
    @tag18
    Scenario: Campo de texto State/Province/Region solo debe permitir como maximo el ingreso de diez caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo State/Province/Region <Antioquia T>
    Then yo puedo validar un mensaje de texto <Use maximum 10 character>
    
    @tag19
    Scenario: Campo de texto Postal Code solo debe permitir como maximo el ingreso de diez caracteres.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso en el campo Postal Code <Antioquia T>
    Then yo puedo validar un mensaje de texto <Use maximum 10 character>
    
    @tag20
    Scenario Outline: Botón de Registro no se debe habilitar si el campo Username se encuentra vacio o mal diligenciado.
    Given que me encuentro en el sitio web advantageonlineshopping.com/
    When le doy click al incono de user 
    And luego click en la opción de create new account
    And ingreso los datos obligatorios para crear la cuenta <Username><Email>
    Then yo puedo validar un mensaje de texto <Use maximum 10 character>
    
    
    
