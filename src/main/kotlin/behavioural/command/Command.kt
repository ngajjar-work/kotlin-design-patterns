package behavioural.command


/**
 * The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing for
 * parameterization of clients with queues, requests, and operations. It decouples the sender and receiver of a request
 * and provides support for undoable operations.
 *
 * Advantages
 * 1. Decoupling: Separates the responsibility of issuing commands from executing them, reducing dependencies between objects.
 * 2. Flexibility: Allows for parameterization of clients with different requests, operations, and queues.
 * 3. Undo/Redo: Facilitates the implementation of undo/redo functionality by encapsulating requests as objects.
 * 4. Command Queuing: Supports queuing of requests and logging of operations for future execution or auditing.
 */

interface Command {
    fun execute()
}

class PlayCommand(private val musicPlayer: MusicPlayer) : Command {
    override fun execute() {
        musicPlayer.play()
    }
}

class PauseCommand(private val musicPlayer: MusicPlayer) : Command {
    override fun execute() {
        musicPlayer.pause()
    }
}

class StopCommand(private val musicPlayer: MusicPlayer) : Command {
    override fun execute() {
        musicPlayer.stop()
    }
}