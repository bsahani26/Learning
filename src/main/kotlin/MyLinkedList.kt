fun main() {
    val list = MyLinkedList()
    list.add(5)
    list.add(10)
    list.add(15)
    list.add(20)
//    list.add(25)
//    list.add(30)

    list.printList()

    println(list.getSize())

    list.insertAt(12, 3)

    list.printList()

    println(list.getSize())

    println(list.nodeAt(3))

}

class MyLinkedList {
    private var head: Node? = null
    private var last: Node? = null
    private var size = 0

    class Node(var data: Int) {
        var next: Node? = null
    }

    fun add(data: Int) {
        val currentNode = Node(data)

        if (head == null) {
            head = currentNode
        } else {
            last?.next = currentNode
        }
        last = currentNode
        size++;

    }

    fun insertAt(value: Int, index: Int) {
        if (index > size) return
        val newNode = Node(value)
        var currentNode = head
        var currentIndex = 0
        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next
            currentIndex++
        }
        newNode.next = currentNode?.next
        currentNode?.next = newNode

        size++
    }


    fun nodeAt(index: Int): Int? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode?.data
    }

    @JvmName("getSize1")
    fun getSize() = size

    fun printList() {
        var currentNode = head
        while (currentNode != null) {
            println(currentNode.data)
            currentNode = currentNode.next
        }
    }
}