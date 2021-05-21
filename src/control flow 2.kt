fun main(args: Array<String>){
  val secretNumber =100
    println("Welcome to the Guessing Game!\n")

    var guess: Int
    var attempts=0

    while (true) {
      print("Enter your guess (1-100): ")
      guess = readLine()!!.toInt()

      when (guess.compareTo(secretNumber)) {
        -1 -> { println("Too small!"); attempts++ }
        0 -> { attempts++; println("You win! You took $attempts guesses!"); return }
        1 -> { println("Too big!"); attempts++ }
      }
    }
  }


