package structural.composite


/**
 * The Composite Pattern is a structural design pattern used to allow clients
 * to treat individual objects and compositions of objects uniformly. It composes objects
 * into tree structures to represent part-whole hierarchies. This pattern lets you build
 * complex structures from simple objects, enabling you to work with them in a consistent way.
 *
 * Advantages
 * 1. Uniformity: Allows individual objects and compositions of objects to be treated uniformly.
 * 2. Simplifies Code: Simplifies client code by treating complex hierarchies of objects in a consistent manner.
 * 3. Flexibility: Provides the ability to create complex structures from simple components and manage them easily.
 * 4. Extensibility: Facilitates the addition of new types of components without altering the client code.
 */


interface FileSystemComponent {
    fun getSize(): Int
    fun getName(): String
}

class File(private val name: String, private val size: Int) : FileSystemComponent {
    override fun getSize() = size
    override fun getName() = name
}