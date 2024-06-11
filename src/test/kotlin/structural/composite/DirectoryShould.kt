package structural.composite

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DirectoryShould {

    @Test
    fun `return correct size for single file`() {
        // Given
        val file = File("file.txt", 100)

        // Then
        assertThat(file.getSize()).isEqualTo(100)
        assertThat(file.getName()).isEqualTo("file.txt")
    }

    @Test
    fun `return correct size for directory with files`() {
        // Given
        val file1 = File("file1.txt", 100)
        val file2 = File("file2.txt", 200)
        val directory = Directory("root")
        directory.add(file1)
        directory.add(file2)

        // Then
        assertThat(directory.getSize()).isEqualTo(300)
        assertThat(directory.getName()).isEqualTo("root")
    }

    @Test
    fun `return correct size for nested directories`() {
        // Given
        val file1 = File("file1.txt", 100)
        val file2 = File("file2.txt", 200)
        val subDirectory = Directory("sub")
        subDirectory.add(file1)
        val rootDirectory = Directory("root")
        rootDirectory.add(subDirectory)
        rootDirectory.add(file2)

        // Then
        assertThat(rootDirectory.getSize()).isEqualTo(300)
        assertThat(rootDirectory.getName()).isEqualTo("root")
    }


}