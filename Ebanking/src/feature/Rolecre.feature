Feature: Role Creation

Scenario Outline: Role Creation with Multiple sets of Data

Given Tester Shouls on RHP

When Tester Enters Uname and Passwod and click Login

When Tester Clicks on Role

Then Tester Click on New Role and Enter "<RoleName>" and "<RoleType>"

When Tester Close The Application

Examples:
 
     | RoleName | RoleType |
     | Tellerabh | E |
     |Cashierabh | E |
     |Gmanager | E | 