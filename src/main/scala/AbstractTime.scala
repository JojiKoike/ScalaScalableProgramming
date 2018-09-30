trait AbstractTime {
  //var hour: Int
  //var minute: Int
  // Extracted these abstract var into getter and setter as below
  def hour: Int         // hour Getter
  def hour_=(x:Int)     // hour Setter
  def minute: Int       // minute Getter
  def minute_=(x:Int)   // minute Setter
}
