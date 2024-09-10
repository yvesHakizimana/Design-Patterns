# Memento Pattern

## Overview
The **Memento Pattern** is a behavioral design pattern used to capture and save an object's internal state so that it can be restored later without violating encapsulation. This pattern is particularly useful for implementing undo/redo functionality and restoring previous states of an object.

## Problem Statement
In many software applications, an object's internal state may change over time due to various operations. There are cases where you need to revert an object back to a previous state, such as:
- Undoing changes in a text editor or graphic editor.
- Rolling back a failed operation to a known good state.
- Implementing checkpointing in long-running processes.

However, exposing the internal state directly violates the principle of encapsulation, making the object vulnerable to misuse.

## Solution
The **Memento Pattern** solves this by allowing the internal state of an object to be saved in a "memento" object, which can be restored later. This process is done without exposing the internal structure or state of the object to the outside world.

## Structure
The pattern consists of three primary components:

1. **Originator**: The object whose state needs to be saved and restored. It creates a memento to capture its state and uses a memento to restore its state.

2. **Memento**: Stores the internal state of the `Originator` object. It does not expose the internal state to the outside world.

3. **Caretaker**: Responsible for storing and retrieving the mementos. The caretaker knows when to save and restore the state but does not have direct access to the contents of the memento.


