import org.specs2._
import Element.elem


class ElementSpecification extends mutable.Specification {
  "A UniformElement"  should {
    "have a width equal to the passed value" in {
      val ele = elem('x', 2,3 )
      ele.width must be_==(2)
    }
    "have a height equal to the passed value" in {
      val ele = elem('x', 2,3)
      ele.height must be_==(3)
    }
    "throw an IAE if passed a negative width" in {
      elem('x', -2, 3) must
        throwA[IllegalArgumentException]
    }
  }
}
