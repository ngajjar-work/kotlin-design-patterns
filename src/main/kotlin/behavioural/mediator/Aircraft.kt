package com.ngajjarwork.designpatterns.behavioural.mediator


// Abstract Aircraft class representing the Colleague
abstract class Aircraft(protected val mediator: ControlTowerMediator, val name: String) {
    init {
        mediator.registerAircraft(this)
    }

    abstract fun send(message: String)
    abstract fun receive(message: String)
}

// Concrete Aircraft classes
class CommercialAircraft(mediator: ControlTowerMediator, name: String) : Aircraft(mediator, name) {
    override fun send(message: String) {
        println("$name sends message: $message")
        mediator.showMessage(this, message)
    }

    override fun receive(message: String) {
        println("$name receives message: $message")
    }
}

class PrivateAircraft(mediator: ControlTowerMediator, name: String) : Aircraft(mediator, name) {
    override fun send(message: String) {
        println("$name sends message: $message")
        mediator.showMessage(this, message)
    }

    override fun receive(message: String) {
        println("$name receives message: $message")
    }
}
