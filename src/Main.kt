fun main() {
    val manager = UserRole.EDITOR
    val employee1 = UserRole.ADMIN
    val intern = UserRole.VIEWER
    val employee2 = UserRole.ADMIN

    println(manager.accessLevel)
    println(employee2.accessLevel)
    println(employee1.accessLevel)
    println(intern.accessLevel)

    edit(employee1)
    edit(manager)

    for (user in UserRole.entries){
        print(user.name)
        println(" -> Access Level: " + user.accessLevel)
    }
}

fun edit(user: UserRole){
    if (user.accessLevel >= 3)
        println("Editing...")
    else
        println("No editing privilages!")
}