import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable
// Test Lab 6
class TestLab1 extends  AnyFunSuite {
  test("The part 1") {
    val list = List("1RockRockRock", "2RockRockRock", "3RockRockRockRockRockRock", "4Rock")
    assert((Scala_lab6.getMaxLengthString(list).length).equals(25))
  }

  test("The part 2") {
    val list1 = List(1,3,5)
    val list2 = List(4,5,4,5)
    val list3 = List(8,9)
    val bigList = List(list1,list2,list3)
    assert((Scala_lab6.flatten(bigList).equals(List(1, 3, 5, 4, 5, 4, 5, 8, 9))))

    val list = List[List[Int]](List[Int](1,2), List[Int](3,4), List[Int](5,6))
    val answer = List[Int](1,2,3,4,5,6)
    assert(Scala_lab6.flatten(list) == answer)
  }

  test("The part 3"){
    val oldMap = mutable.Map[Int, Int](1->1,2->6,3->4,4->16,5->25)
    val needMap = mutable.Map[Int, Int](5->25, 4->16, 1->1)
    assert(Scala_lab6.delKeys(oldMap).equals(needMap))
  }

}
