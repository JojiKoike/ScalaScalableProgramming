package bobsrockets.navigation

private[bobsrockets] class Navigator {
  val map: StarMap = new StarMap
  protected[navigation] def userStarChart(): Unit = {}
  class LegOfJourney {
    private[Navigator] val distance = 100
  }
  private[this] var speed = 200

}
