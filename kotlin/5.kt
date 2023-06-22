class Solution {
    private fun searchStringForPalindrome(stringInput: String, startingLongestString: String, leftSideInput: Int, rightSideInput: Int): String {
        var longestString = startingLongestString
        var leftSide = leftSideInput
        var rightSide = rightSideInput

        /*
            sliding window that checks we're not outside the bounds of the string and the chars at the edges of the window are the same
            if they're the same, widen the window and check again; next loop might be bigger
            if they're not the same, its not a palindrome. get out of the function and have the main move on to the next index
         */
        while (leftSide >= 0 && rightSide < stringInput.length && stringInput[leftSide] == stringInput[rightSide]) {

            // this string matches, but is it bigger than the biggest so far???
            if (rightSide - leftSide + 1 > longestString.length) {

                // set the new longest string
                longestString = stringInput.substring(IntRange(leftSide, rightSide))
            }

            // widen the search window
            leftSide = leftSide - 1
            rightSide = rightSide + 1
        }

        return longestString
    }

    fun longestPalindrome(s: String): String {

        var longestString: String = ""

        for (i in s.indices) {
            //check for an odd length string
            longestString = searchStringForPalindrome(s, longestString, i, i)

            //check for an even length string
            longestString = searchStringForPalindrome(s, longestString, i, i + 1)
        }
        
        return longestString
    }
}

fun main(){
    val solution = Solution()
    println(solution.longestPalindrome("babad"))
    println(solution.longestPalindrome("cbbd"))
    println(solution.longestPalindrome("a"))
    println(solution.longestPalindrome("aa"))
    println(solution.longestPalindrome("abb"))
    println(solution.longestPalindrome("qwertyuiopoiuytrewq"))
    println(solution.longestPalindrome("qwertyuioppoiuytrewq"))
    println(solution.longestPalindrome("asdfasgrljlj35lyabcdefghhgfedcbaoh8ubosidlwj6yl35jyfsljs5jyljhaaaaab"))
}