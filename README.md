Xerris_technical_interview_code_challenge
---
Author: Feeco

Date: 2020-08-09

Disclaimer: The above codes are all written by me. No network information is referenced.

## nice to have:

1.object serialized to improve security

2.remove setters to avoid mutation and improve security 

3.clearing the console screen after each user input would be better simulation of real game scenario. Here we keep code simple and clear to Xerris. 

4.column input as ABCDEFGH would be better, here we use number for keep code simple and clear to Xerris.

5.would be better that characters represent ship and hit tracing are different. Here all of them are represent by "x" to keep it simple and clear to Xerris.  

## commits
1.2020-08-08: finish program

2.2020-08-09: finish tests

3.2020-08-10: finish the Readme file for Xerris

## program usage

### run
java -jar Xerris_technical_interview_code_challenge

### game rules
1.first round place the ship. if two ships choose the same initial position. game restart out of fairness.

2.if ship is out of ocean, need to re-position.

3.wrong coordinator (e.g:"fjdaljfa" ) can not be accepted. need to re-enter.

4.wrong direction will force to quit the game.

5.each turn, player enter the position of hit. The taken positions will be ignored including own ship and position hit before.

6.hit position must be in the ocean(8x8), if not, re-enter.

7.three hits win. quit the game.

## coverage report

All objects and methods are tested except printing method and game menu.

## tools
IDE: intellij
Automated System: Maven
unit test: Junit
