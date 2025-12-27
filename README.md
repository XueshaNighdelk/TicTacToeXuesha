# TicTacToeXuesha
🎮 Console Tic-Tac-Toe
A classic Tic-Tac-Toe game built in Java that runs directly in the command line interface (CLI). Two players can play against each other using a coordinate-based input system.

Features :
2-Player Logic: Play against a friend locally (Hotseat PvP).

Coordinate System: Uses algebraic notation (e.g., a1, b2) for moves, similar to Chess.

Input Validation: Prevents players from overwriting taken spots.

Win Detection: Automatically checks for Horizontal, Vertical, and Diagonal wins.

Draw Detection: Declares a draw if the board fills up with no winner.

Getting Started :
Prerequisites

Java Development Kit (JDK) installed on your machine (version 8 or higher recommended).

How to Run

Open your terminal or command prompt.

Navigate to the directory containing TicTacToe.java.

Compile the code:

Bash
javac TicTacToe.java
Run the game:

Bash
java TicTacToe
🕹️ How to Play
The board is arranged in a 3x3 grid using columns (a, b, c) and rows (1, 2, 3).

The Grid Layout:

Plaintext
 a3 | b3 | c3 
 a2 | b2 | c2 
 a1 | b1 | c1 
Player 1 is X.

Player 2 is O.

When prompted, type the coordinate of the box you want to claim (e.g., a1 or b3) and press Enter.

The game ends when a player gets 3 in a row or the board is full.

Gameplay Example :

Plaintext
WELCOME TO TIC-TAC-TOE
FIRST PLAYER GOES 'x', SECOND 'o'
PLEASE ENTER THE COORDINATE TO GIVE MOVE

a3 b3 c3 
a2 b2 c2 
a1 b1 c1 

PLAYER 1 (x) PLEASE GIVE YOUR MOVE
> b2

|_| |_| |_| 
|_| |x| |_| 
|_| |_| |_| 
🛠️ Project Structure
TicTacToe-Java/
│
├── TicTacToe.java    # Main game source code
├── TicTacToe.class   # Compiled bytecode (generated after compiling)
└── README.md         # Project documentation

Future Improvements :

[ ] Add a "Play Again" loop so you don't have to restart the program.

[ ] Add a Single Player mode (Player vs Computer).

[ ] Add color to the console output (ANSI colors).

Created by [XueshaNighdelk]
