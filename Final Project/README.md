# Synopsis

This final project is a fun game in which you must pop all of the circles in a set amount of time in order to win.

# Code Example

What you will be doing with this code is when you click on the colored circles, they will disappear.  Once all of the circles have disappeared, or the timer has run out the game is over.
Example: This is the code that creates my timer.

	animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			int number = Integer.parseInt(count.getText());
			
			if (number > 0) {
				number--;
				count.setText(Integer.toString(number));
			}

# Motivation

My motivation for this project was mainly that I had to because it was a part of my class, but I also chose to do this project because I thought it would be quite fun to create and to watch it unfold, and this time it is visual too.

# Installation

What you must do is download the .java file and run it in a program that accepts .java files.

# Tests
Most of the testing I did was debugging my code and manually and visually testing it.  Another thing I did was print out the counter so I could make sure it was working correctly.  I also used JUnit4 to test my project.

# Contributors

The only contributor to this project was myself.  I've been really excited for this project so I've spent a lot of time from the past week or 2 on this project.
