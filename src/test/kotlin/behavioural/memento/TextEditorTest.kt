package behavioural.memento

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TextEditorTest {

    private lateinit var textEditor: TextEditor
    private lateinit var caretaker: TextEditorCaretaker

    @BeforeEach
    fun setUp() {
        textEditor = TextEditor()
        caretaker = TextEditorCaretaker()
    }

    @Test
    fun testWriteAndSave() {
        textEditor.write("Hello, ")
        caretaker.save(textEditor)
        assertEquals("Hello, ", textEditor.read())

        textEditor.write("World!")
        caretaker.save(textEditor)
        assertEquals("Hello, World!", textEditor.read())
    }

    @Test
    fun testUndo() {
        textEditor.write("Hello, ")
        caretaker.save(textEditor)

        textEditor.write("World!")
        caretaker.save(textEditor)
        assertEquals("Hello, World!", textEditor.read())

        caretaker.undo(textEditor)
        assertEquals("Hello, ", textEditor.read())
    }

    @Test
    fun testMultipleUndos() {

        caretaker.save(textEditor)

        textEditor.write("This ")
        caretaker.save(textEditor)

        textEditor.write("is ")
        caretaker.save(textEditor)

        textEditor.write("a ")
        caretaker.save(textEditor)

        textEditor.write("test.")
        caretaker.save(textEditor)

        assertEquals("This is a test.", textEditor.read())

        caretaker.undo(textEditor)
        assertEquals("This is a ", textEditor.read())

        caretaker.undo(textEditor)
        assertEquals("This is ", textEditor.read())

        caretaker.undo(textEditor)
        assertEquals("This ", textEditor.read())

        caretaker.undo(textEditor)
        assertEquals("", textEditor.read())
    }
}