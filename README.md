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

2.2020-08-09: finish tests and refactor and repeate

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

## reqirements

#### Background
- Purpose of this exercise is to get a sense of how you code.
- Use whatever language or framework you feel most comfortable with.

#### Game Requirements
- Two Players.
- Two Boards (one for each player).
- 1 Ship (length of 3) – can be vertical or horizontally placed.
- Fire a single shot per turn (Hit, Miss, or if ship has been Sunk (3 hits) then register a “you sunk my battleship”).
- First round should allow placement of Ship for each player.
- Game ends when the player sinks the other player’s ship.

#### What We Are Looking for
- Good object design and component breakdown.
- 80% automated unit test code coverage.
- Automated build system of choice (maven, Node.js, PowerShell, etc.).
- Runs from the command line

#### Additional Information
- Should take 2-3 days to complete.
- Should be a console application.
- Should be built/designed using test driven development.
- Language of choice.
- No database backend required.
- No user interface is needed.
