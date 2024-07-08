package behavioural.memento

/**
 * The Memento pattern is used to capture and restore an object's internal
 * state without violating its encapsulation. It is often used to implement undo functionality.
 *
 * Advantages
 * 1. Encapsulation: The Memento pattern preserves encapsulation boundaries.
 * The internal state of the object is only accessible through the memento.
 *
 * 2. Undo/Redo: It provides a way to restore an object to its previous state,
 * which is essential for implementing undo functionality.
 *
 * 3. State Management: Helps in managing state history, allowing the system
 * to revert to previous states if needed.
 *
 *
 * Memento pattern contains 3 components: Memento, Originator, Caretaker
 *
 * Memento hold state, Originator save/restore state, and Caretaker decide when to store/restore state.
 */


//Originator
class TextEditor {
    private var text: String = ""

    fun write(text: String) {
        this.text += text
    }

    fun read(): String {
        return text
    }

    fun save(): TextEditorMemento {
        return TextEditorMemento(text)
    }

    fun restore(memento: TextEditorMemento) {
        text = memento.text
    }


    //Memento Class
    data class TextEditorMemento(val text: String)
}

