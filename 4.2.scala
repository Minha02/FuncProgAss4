object act42 extends App{
    println("Enter a number:")
    val num = scala.io.StdIn.readLine().toInt

    def patternMatch(number: Int):String = number match{
    case number if number <= 0 => "NEgative/Zero"
    case number if number %2 == 0 => "Even Number"
    case _                        => "Odd number"
 }
 println(patternMatch(num))
}