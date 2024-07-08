package behavioural.command

class MusicPlayerButton(private var command: Command) {
    fun setCommand(command: Command) {
        this.command = command
    }

    fun click() {
        command.execute()
    }
}