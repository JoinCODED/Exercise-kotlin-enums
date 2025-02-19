fun main() {

        val admin = UserRole.ADMIN; val editor = UserRole.EDITOR; val viewer = UserRole.VIEWER

        for (user in UserRole.entries){
        println("${user.name} access level is ${user.accessLevel}")
        accessType(admin)
}
}

 fun accessType (user: UserRole){
        if (user.accessLevel == 1){
                println("User is Admin")
        }
         else {
                 println("User is not Admin")
        }
}
