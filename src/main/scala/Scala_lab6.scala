import scala.collection.mutable

// Лабораторная 6

object Scala_lab6 {

  // ЧАСТЬ 1. Вариант 7 (по списку группы)
  // Найти длину самого длинного слова в коллекции.
  def getMaxLengthString(list: List[String]): String = {
    list.reduce({(a: String, b: String) => if (a.length > b.length) a else b})
  }

  // ЧАСТЬ 2. Вариант 5 (по списку подгруппы)
  // 	Реализовать функцию 'flatten', которая конкатинирует список списков.
  def flatten(list: List[List[Int]]): List[Int] = {
    list.fold(List[Int]())(_ ::: _)
  }

  // Часть 3. Вариант 5 (по списку подгруппы) g
  // 	Убрать из Map[Int,Int] ключи, которые не равны квадратному корню их значений.

  def delKeys(map: mutable.Map[Int, Int]):mutable.Map[Int, Int]= {
    map.filter(f => f._1 == Math.sqrt(f._2))
  }

}
