package behavioural.memento

class TextEditorCaretaker {
    private val mementoList = mutableListOf<TextEditor.TextEditorMemento>()
    private var currentStateIndex = -1

    fun save(textEditor: TextEditor) {

        // Remove any states that are beyond the current index, if we are saving a new state after some undos.
        if (currentStateIndex < mementoList.size - 1) {
            mementoList.subList(currentStateIndex + 1, mementoList.size).clear()
        }

        val memento = textEditor.save()
        mementoList.add(memento)
        currentStateIndex = mementoList.size - 1
    }

    fun undo(textEditor: TextEditor) {
        if (currentStateIndex > 0) {
            currentStateIndex--
            val memento = mementoList[currentStateIndex]
            textEditor.restore(memento)
        }
    }
}