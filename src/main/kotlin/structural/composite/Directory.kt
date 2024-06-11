package structural.composite

class Directory(private val name: String) : FileSystemComponent {
    private val children = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        children.add(component)
    }

    fun remove(component: FileSystemComponent) {
        children.remove(component)
    }

    override fun getSize(): Int {
        return children.sumOf { it.getSize() }
    }

    override fun getName() = name
}