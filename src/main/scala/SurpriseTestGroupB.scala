object SurpriseTestGroupB extends App {
  def stringCapitalize(string: String, char: Char): String = {
    val index = string.length

    def anotherString(newString: String, index: Int): String = {
      if (index < 0) newString
      else {
        anotherString(string, index - 1)
        if (newString.charAt(index) == char) {
          newString.charAt(index) = newString.charAt(index).toInt - 32
        }
      }
      newString
    }

    string
  }

  println(stringCapitalize("hello", 'l'))
}
