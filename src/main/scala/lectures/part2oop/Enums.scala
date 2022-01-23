package lectures.part2oop

object Enums {

  enum Permissions{
      case READ, WRITE, EXECUTE, NONE
      //add fields or methods
      def openDocument():Unit =
        if (this == READ) println("opening documents")
        else println("reading not allowed.")

  }

  val somePermissions: Permissions  = Permissions.WRITE

  //constructors args
  enum PermissionsWithBits(bits: Int){
    case READ extends PermissionsWithBits(4)//100
    case WRITE extends PermissionsWithBits(2)//010
    case EXECUTE extends PermissionsWithBits(1)//001
    case NONE extends PermissionsWithBits(0)//000
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = //wharever
    PermissionsWithBits.NONE
  }

  //standart API
  val somePermissionsOrdinal = somePermissions.ordinal
  val allPermissions = PermissionsWithBits.values //array of all possible values of the enum


  val readPermission: Permissions = Permissions.valueOf("READ")


  def main(args: Array[String]):Unit ={
    somePermissions.openDocument()
    somePermissions.openDocument()
  }

}
