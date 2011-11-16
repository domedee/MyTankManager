package org.lincknet

class TankController {

    def list = {
        def map = [tankList:Tank.list()]
        render(view:"tankList", model:map)

    }
    
}
