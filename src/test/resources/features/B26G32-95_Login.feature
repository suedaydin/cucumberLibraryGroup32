@LibraryCT-GR32
Feature: User account tests
  As a user, I should be able to login with different users using their correct emails and passwords

    @allAccounts
   Scenario Outline: As a user, I should be able to login to LibraryCT
     Given user is on the loginPage
    And verify that the title is "Login - Library" and verify the URL is "https://library2.cydeo.com/login.html"
    When user enters valid "<email>" and "<password>"
    And user clicks sign in button
    Then verify that there are 3 or 2 modules on the page

     @librarian @B26G32-106 @B26G32-107
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


   @B26G32-115 @B26G32-116   @students
    Examples:
      | email            | password |
      | student1@library | d5fv9BtX |
      | student2@library | zyxa10vg |
      | student3@library | rPjgZ86a |
      | student4@library | pG3V6qaL |
      | student5@library | i1oDgf2d |
      | student6@library | NXhpXJdC |
      | student7@library | QfYjDNXj |
      | student8@library | 1DaJSz1z |
      | student9@library | DFDYll1P |
      | student10@library| F8u6OrI2 |
      | student11@library| 4VRMTsAB |
      | student12@library| 8ENtWqOe |
      | student13@library| Y0kaXNMa |
      | student14@library| bL1twuqT |
      | student15@library| 9WB9sVtF |
      | student16@library| 2Ziw6vOx |
      | student17@library| FmmXHzpF |
      | student18@library| qxt5XZgZ |
      | student19@library| xDxywYeJ |
      | student20@library| nGdNzH1e |
      | student21@library| y5pYTlqY |
      | student22@library| 2eMI9Uyk |
      | student23@library| zzTYIurO |
      | student24@library| OwsiR4u5 |
      | student25@library| gb6SmZjb |
      | student26@library| zC7BUYHs |
      | student27@library| E1uZrsAu |
      | student28@library| tJ93UQS3 |
      | student29@library| g8EyNm9B |
      | student30@library| QX6FWzj6 |
      | student31@library| yEKjyg5T |
      | student32@library| RqJkWmUu |
      | student33@library| 4V3Kd1YG |
      | student34@library| JySGHP8G |
      | student35@library| r2oOkz9m |
      | student36@library| WV2WrNrk |
      | student37@library| sqs9B1TY |
      | student38@library| nca2fAGL |
      | student39@library| kCrQEt6X |
      | student40@library| ZkFJCgOd |
      | student41@library| FsOQE0Xq |
      | student42@library| 1oXkp7l2 |
      | student43@library| AKDv7j74 |
      | student44@library| GaPt5us4 |
      | student45@library| c4GeJZ54 |
      | student46@library| pZg19ua5 |
      | student47@library| yabV3kwK |
      | student48@library| 1i33g2PC |
      | student49@library| l1Wj8WGv |
      | student50@library| TqKXmAC4 |
      | student51@library| 49iP65vD |
      | student52@library| E5idT5e8 |
      | student53@library| o8hqDkKg |
      | student54@library| vlrGqQPI |
      | student55@library| xBLy3ufr |
      | student56@library| 3JgJAhsi |
      | student57@library| O76CUuPE |
      | student58@library| WS3rm9xG |
      | student59@library| cJaTyCRJ |
      | student60@library| AoSFw44Y |

      @B26G32-113 @B26G32-117 @negativeTC_login
      Scenario: Login with invalid credential
        Given user is on the loginPage
      When user enters invalid email "makeup@cydeo.com" or password "makeup123"
      And user clicks sign in button
      Then user sees the error message "Sorry, Wrong Email or Password"