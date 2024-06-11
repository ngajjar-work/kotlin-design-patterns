package structural.composite

interface FileSystemComponent {
    fun getSize(): Int
    fun getName(): String
}

class File(private val name: String, private val size: Int) : FileSystemComponent {
    override fun getSize() = size
    override fun getName() = name
}