Feature: User account tests
  As a user, I should be able to login with different users using their correct emails and passwords

  Background:
    Given user is on the loginPage

  @librarian @B26G32-106 @B26G32-107
  Scenario Outline: As a Librarian, I should be able to login to LibraryCT

    And verify that the title is "Login - Library"
    When librarian enters valid "<email>" and "<password>"
    And librarian clicks sign in button
    Then verify that there are 3 modules on the page

    Examples:
      | email              | password |
      | librarian1@library | qU9mrvur |
      | librarian2@library | uYrhHmmj |
      | librarian3@library | DFvU4b1i |
      | librarian4@library | 3lwxJ1Kk |
      | librarian5@library | hj65YBiE |
      | librarian6@library | QaG7mkXA |
      |librarian7@library  | C5WUiPUP |
      |librarian8@library  | UECJkTnl |
      |librarian9@library  | MSx8u9n4 |
      |librarian10@library | ZIkOcbCa |
      |librarian11@library | fsRRgXxB |
      |librarian12@library | wHhJQDSK |
      |librarian13@library | YCJCbmU3 |
      |librarian14@library | bWN7YaaB |
      |librarian15@library | YLu0ZIMj |
      |librarian16@library | MnG7Xy72 |
      |librarian17@library | adE5UAha |
      |librarian18@library | FZLa1m9D |
      |librarian19@library | f7q2SyVX |
      |librarian20@library | MVI4SRzg |
      |librarian21@library | ZxlVsgKX |
      |librarian22@library | JUXl6dnx |
      |librarian23@library | 6PQrr2Ok |
      |librarian24@library | 8v8ZByKA |
      |librarian25@library | Uplz5iPS |
      |librarian26@library | g2X4lxZz |
      |librarian27@library | la4sfpjs |
      |librarian28@library | x3AVlP4e |
      |librarian29@library | m0cvGNnH |
      |librarian30@library | oZzv4ePp |
      |librarian31@library | rVPrG4uI |
      |librarian32@library | 72kOI6Zl |
      |librarian33@library | RLYB9ZPA |
      |librarian34@library | n3jnk5Rd |
      |librarian35@library | H11DHnKj |
      |librarian36@library | tXH2IlVj |
      |librarian37@library | bkO2Kl4d |
      |librarian38@library | 6TN8WpcY |
      |librarian39@library | snPPHvLX |
      |librarian40@library | 5NRVIgK3 |
      |librarian41@library | gDSgcjYr |
      |librarian42@library | EDpvlxKt |
      |librarian43@library | 9Wa02cAu |
      |librarian44@library | Jn82fRUp |
      |librarian45@library | ShIqQpOy |
      |librarian46@library | BEHjX7WP |
      |librarian47@library | qPL9cVwm |
      |librarian48@library | h0lqSR63 |
      |librarian49@library | 8l9bsLAN |
      |librarian50@library | LXHU2DkJ |
      |librarian51@library | vGTWHXgx |
      |librarian52@library | p3c33VSf |
      |librarian53@library | whtQ6kpH |
      |librarian54@library | a6aZeunQ |
      |librarian55@library | 67UQi3Ol |
      |librarian56@library | pBQnq0NN |
      |librarian57@library | SHzFWv8X |
      |librarian58@library | gxiYGKjy |
      |librarian59@library | DmSqxDEJ |
      |librarian60@library | Lj5VU4Tq |