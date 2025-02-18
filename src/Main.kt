fun main() {

    var  admin = UserRole.ADMIN
    var levelNum = 2

    println( "Is the level of  ${admin.name} --> $levelNum  ??? the answer is ${isSufficientLevel(admin,levelNum)} ")
    for (user in UserRole.entries)
    {
        println("level: ${user.level}   name:${user.name}")
    }
}