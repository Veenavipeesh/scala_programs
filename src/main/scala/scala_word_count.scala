object scala_word_count {
def main (args: Array[String]): Unit = {
  println("Enter the sentence: ")
  var word_group = scala.io.StdIn.readLine()
  println("Enter the word to count: ")
  var word = scala.io.StdIn.readLine()
  var word_array = word_group.split(" ")
  var word_count = 0
  for (i <- 0 until word_array.length){
    if(word == word_array(i)){
      word_count = word_count + 1
    }
  }
  print("Word "+word+" is "+word_count+" times present in the sentence!")
}
}
