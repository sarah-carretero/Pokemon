# Pokémon Guessing Game

A console-based Poeémon guessing game developed in Java as an Object-Oriented Programming project.

The player must identify a randomly selected Pokemon by asking questions about its type and attacks. Based on the answers, the game eliminates Pokemon that do not match the available clues until the player makes a guess.

## Overview

The game includes 15 Pokemon divided into three types:

* Water
* Fire
* Earth

Each Pokemon is assigned four randomly selected attacks from a predefined list.

At the beginning of each game, one Pokemon is randomly selected as the secret Pokemon. The player can then ask questions about its type or attacks before attempting to identify it.

## Features

* Random selection of the secret Pokemon.
* 15 playable Pokemon.
* Three Pokemon types: Water, Fire, and Earth.
* Randomly generated attacks for each Pokemon.
* Questions about Pokemon types.
* Questions about Pokemon attacks.
* Automatic elimination of Pokemon based on the player's answers.
* Case-insensitive Pokemon name matching.
* Win/loss detection.
* Player score tracking.
* Persistent score storage using `.txt` files.
* Console-based interaction.

## Object-Oriented Programming Concepts

This project was developed to practice core Object-Oriented Programming concepts in Java.

### Encapsulation

The `pokemon` class stores its attributes as private fields and provides getter methods to access them.

### Inheritance

The Pokémon types inherit from the abstract `pokemon` class:

### Abstraction

`pokemon` is an abstract class that defines common behavior while requiring subclasses to implement methods

### Polymorphism

Different Pokémon types implement the same abstract methods with their own behavior. This allows the game to work with Pokémon objects through the common `pokemon` type.

## Technologies

* Java
* Object-Oriented Programming
* Java Collections / Arrays
* `Random`
* `Scanner`
* File I/O
* `BufferedReader`
* `FileReader`
* `FileWriter`
* `PrintWriter`

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/sarah-carretero/Pokemon.git
```

### 2. Open the project

Open the project in an IDE such as Visual Studio Code, Eclipse, or another Java-compatible IDE.

### 3. Compile the Java files

Make sure the Java files are in the same package/directory if no package declaration is being used.

### 4. Run the main class

Run:

```text
pokemonMain
```

The game will start in the console.

## Score System

The game allows players to save their results using text files.

A player's file stores their games played and games won.

This allows the game to keep track of the player's total games and wins between sessions.

## Learning Objectives

Through this project, I practiced:

* Designing classes and relationships using OOP principles.
* Implementing inheritance and abstract classes.
* Applying polymorphism.
* Managing arrays and objects.
* Generating random values.
* Processing user input.
* Implementing game logic and filtering.
* Reading and writing data to files.
* Organizing a Java console application.

### 👩‍💻 Author

**Sarah Carretero**

Computer Systems Engineering Student
