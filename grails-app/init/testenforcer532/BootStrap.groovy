package testenforcer532

import com.security.enforcer.UserService

class BootStrap {

    UserService userService

    def init = { servletContext ->
        userService.initUsers()
    }
    def destroy = {
    }
}
