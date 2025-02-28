//fun main() {
//    val map = MyHashMap()
//    map.put(1,2)
//    map.put(1,3)
//    map.put(2,3)
//    map.put(4,5)
//    map.put(6,7)
//    map.put(8,9)
//    map.put(5,6)
//    map.put(3,4)
//    map.printMap()
//}
//
//
//class MyHashMap {
//    private val buckets: Array<LinkList<Int, Int>>
//    //var n = 0
//    //var N = 5
//    private var i = -1
//
//    init {
//        buckets = Array(5) { LinkList() }
//    }
//
//    fun printMap() {
//        for (k in buckets.indices) {
//            buckets[k].printValues(k)
//        }
//    }
//
//
//    fun put(k: Int, v: Int) {
//        getBucketIndex()
//        var list = buckets[i]
//        list.add(Node(k, v))
//        i++
//    }
//
//    fun getBucketIndex() {
//        i = (i + 1) % 5
//    }
//
//
//    class Node<K, V>(val key: K, val value: V) {
//        var next: Node<K, V>? = null
//    }
//
//    class LinkList<K, V> {
//
//        private var head: Node<K, V>? = null
//        var size = 0
//        fun add(node: Node<K, V>) {
//            var current = head
//            if (current == null) {
//                head = node
//            } else {
//                while (current?.next != null) {
//                    current = current.next
//                }
//                current?.next = node
//            }
//            size++
//        }
//
//        fun printValues(k: Int) {
//            var current = head
//            while (current != null) {
//                print("$k=${current.key}->${current.value}, ")
//                current = current.next
//            }
//        }
//
//    }
//}
