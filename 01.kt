fun main(args: Array<String>) {
    val oddEvenList = oddEvenList<Int>()
    println("Index at "+oddEvenList.add(1))
    println("Index at "+oddEvenList.add(2))
    println("Index at "+oddEvenList.add(3))
    println("Index at "+oddEvenList.add(4))
    println("Index at "+oddEvenList.add(5))
    println("Remove status "+oddEvenList.remove(3))
    println("Array with odd index"+oddEvenList.getOdd())
    println("Array with even index"+oddEvenList.getEven())
    println("Array with random index"+oddEvenList.getRandom())
}

class oddEvenList<T> {

    var arr = arrayListOf<T>()

    fun add(input: T): Int {
        arr.add(input)
        return arr.indexOf(input)
    }

    fun remove(index: Int): Boolean{
        if (index < 0 || index > arr.size) {
            return false
        }
        arr.removeAt(index)
        return true
    }

    fun getOdd(): ArrayList<T>{
        var oddArr = arrayListOf<T>()
        for (i in 0..arr.size-1) {
            if (i % 2 > 0) {
                oddArr.add((arr[i]))
            }
        }
        return oddArr
    }

    fun getEven(): ArrayList<T> {
        var evenArr = arrayListOf<T>()
        for (i in 0..arr.size-1) {
            if (i % 2 == 0) {
                evenArr.add((arr[i]))
            }
        }
        return evenArr
    }

    fun getRandom(): ArrayList<T> {
        var rndArr = arrayListOf<T>()
        for (i in 0..arr.size-1) {
            var rnd = (0..arr.size-1).random()
            rndArr.add((arr[rnd]))
        }
        return rndArr
    }
}