# Pokemon Guessing Game

A console-based Pokemon guessing game developed in Java as an Object-Oriented Programming project.

The player must identify a randomly selected Pokemon by asking questions about its type and attacks. Based on the answers, the game eliminates Pokemon that do not match the available clues until the player makes a guess.

## Overview

The game includes 15 Pokemon divided into three types:

* Water
* Fire
* Plant

Each Pokemon is assigned four randomly selected attacks from a predefined list.

At the beginning of each game, one Pokemon is randomly selected as the secret Pokemon. The player can then ask questions about its type or attacks before attempting to identify it.

## Features

* Random selection of the secret Pokemon.
* 15 Pokemon candidates.
* Three Pokemon types: Water, Fire, and Plant.
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

The `pokemon` class keeps its attributes private and provides getter methods to control access to the Pokémon's name and attacks.

### Inheritance

The Pokémon types inherit from the abstract `pokemon` class:
pokemon
  - agua
  - fuego
  - planta
This allows the three Pokemon types to share common attributes defined in the parent class

### Abstraction

`pokemon` is an abstract class that defines common attributes and behavior while requiring subclasses to implement specific methods such as `decirTipo()` and `getTipo()`.

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

## Project Structure
Pokemon
  - ejecutarPokemon.java 
  - pokemon.java
  - pokemonMain.java
  - pokemonMenu.java
  -  README.md
## Main Components
pokemon.java — Defines the abstract Pokemon class and its three subclasses: agua, fuego, and planta.
pokemonMenu.java — Contains the main game logic, questions, Pokemon filtering, guessing system, and score management.
ejecutarPokemon.java — Controls the game flow.
pokemonMain.java — Entry point of the application.

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

A player's score is stored in a `.txt` file using their name.

The file keeps track of:
- Games played
- Games won

This allows the game to preserve the player's statistics between sessions.

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

### Author

**Sarah Carretero**

Computer Systems Engineering Student
