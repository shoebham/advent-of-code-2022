

fun main() {


    fun part1(input: List<String>): Int {
        var ans=0
        for(word in input){
            var common:Char? = null
            val freqMap1 = mutableMapOf<Char,Int>()
            val freqMap2 = mutableMapOf<Char,Int>()

//            lower case priority= 1-26
//            upper 27-52
            val middle = word.length/2
            for(i in (0..middle-1)){
                freqMap1.put(word[i],freqMap1.getOrDefault(word[i]+1,1));
            }
            for(i in middle .. word.length-1){
                freqMap2.put(word[i],freqMap2.getOrDefault(word[i]+1,1))
            }
            freqMap1.map {
                if(freqMap2.containsKey(it.key)){
                    val ascii  = it.key.toChar().code
//                    println("ascii "+ascii)
                    if(ascii>=65&&ascii<=90){
                        ans+=(ascii-38)
//                        println("ans"+ (ascii-38))
                    }else{
                        ans+=(ascii-96)
//                        println("ans "+(ascii-96))
                    }
                }
            }
        }

        return ans


    }
    fun part2(input:List<String>):Int{
        var ans=0
        var j=0
        while(j<=input.size-1){
            val set1 = mutableSetOf<Char>()
            val set2 = mutableSetOf<Char>()
            val set3 = mutableSetOf<Char>()
            val word1=input[j]
            val word2=input[j+1]
            val word3=input[j+2]
            for(letter in word1)set1.add(letter)
            for(letter in word2)set2.add(letter)
            for(letter in word3)set3.add(letter)
            set1.map {
                if(set2.contains(it)&&set3.contains(it)){
                    val ascii  = it.code
//                    println("ascii "+ascii)
                    if(ascii>=65&&ascii<=90){
                        ans+=(ascii-38)
//                        println("ans"+ (ascii-38))
                    }else{
                        ans+=(ascii-96)
//                        println("ans "+(ascii-96))
                    }
                }
            }
            j+=3
        }
        return  ans;
    }

    val input = readInput("Day03")
//    println(part1(input))
    println(part2(input))
}