import org.scalatest.funsuite.AnyFunSuite

class TestLab1 extends  AnyFunSuite {
  test("The number of occurrences of a character in a string TEST") {
    val str = "123456455676kutyjfhtd3897ykmflfg2378564785hjgfdutkfukyfuyf35t475864876745tg63gv667t78901234"
    val symbol = '7'
    assert((Lab1.getMaxTailCall(str,symbol)).equals(Lab1.Work(str,symbol.toString())))
  }
}
