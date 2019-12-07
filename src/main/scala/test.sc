object OneTimeCode {
  def apply(length: Int = 6) = {
    Random.alphanumeric.take(length).mkString("")
  }
}