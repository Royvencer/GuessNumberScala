import scala.util.Random
import scala.io.StdIn

object GuessRandomNumber {
  def main(args: Array[String]): Unit = {
    val minNumber = 1
    val maxNumber = 100
    val randomNumber = Random.nextInt(maxNumber - minNumber + 1) + minNumber

    var guessed = false
    var attempts = 0

    println(s"Welcome to Guess the Random Number game! I've picked a number between $minNumber and $maxNumber. Can you guess it?")

    while (!guessed) {
      println("Enter your guess:")
      val guess = StdIn.readInt()
      attempts += 1

      if (guess == randomNumber) {
        println(s"Congratulations! You guessed the number $randomNumber correctly in $attempts attempts.")
        guessed = true
      } else if (guess < randomNumber) {
        println("Too low! Try again.")
      } else {
        println("Too high! Try again.")
      }
    }
  }
}
