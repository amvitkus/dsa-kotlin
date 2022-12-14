package algorithms.recursion.reversestring

fun main() {
    val reverse = ReverseString()
    val reversedString = reverse.reverseStringIterative("Ready for an adventure")
    println(reversedString)
    println(reverse.reverseStringRecursive("Ready for an adventure"))
}

//Class to reverse a string
class ReverseString {
    fun reverseStringIterative(string: String): String {
        val charArray = string.toCharArray()
        for (i in 0 until charArray.size / 2) {
            val temp = charArray[i]
            charArray[i] = charArray[charArray.size - 1 - i]
            charArray[charArray.size - 1 - i] = temp
        }
        return String(charArray)
    }

    fun reverseStringRecursive(string: String): String {
        return if (string == "")
            ""
        else
            reverseStringRecursive(string.substring(1)) + string[0]
    }
}