//5. Найти количество вхождений символа в строке

// По заданию работа с консолью должна не присутствовать,
// исходя из этого ввода нету, а данные берутся из main(а)
import scala.annotation.tailrec


object Lab1 {
  // Не рекурсивный способ
  def Work(STR : String, sb : String): Int = {
    STR.split(sb).length-1
  }

  //хвостовая рекурсия
  def getMaxTailCall(str: String,symbol: Char):Int = {
    @tailrec
    def getMax(str: String, i:Int,symbol: Char, counter:Int): Int = {

      if (i == str.length) counter
      else if (str.charAt(i).equals(symbol)) {                  // Если предыдущий элемент одинаков с текущим
        getMax(str, i + 1, symbol, counter + 1)                 // Если найдена большая одинаковая последовательность
      }
      else getMax(str, i + 1, symbol, counter)
    }
    getMax(str, 0, symbol, 0)
  }

  private def formatGetNumberOfSymbols(str: String,symbol: Char):String = {
    val str1 = "The number of occurrences of a character in a string recursion: %d"
    str1.format(getMaxTailCall(str,symbol))
  }


  // Без хвостовой рекурсии
  private def formatGetNumbersNoRecursion(str: String,symbol: Char):String = {
    val str1 = "The number of occurrences of a character in a string: %d"
    str1.format(Work(str,symbol.toString()))
  }


  def main(args: Array[String]): Unit = {

    val str = "12345678901234"
    val symbol = '7'
    println(formatGetNumbersNoRecursion(str,symbol))
    println(formatGetNumberOfSymbols(str,symbol))

  }

}
