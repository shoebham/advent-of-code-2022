import kotlin.math.max

fun main() {
    fun part1(input: List<String>): Int {
        var sum =0;
        var ans:Int=0;
        val sortedList = mutableListOf<Int>()
        for(x in input){
            println("x="+x)
            if(x==""){
                sum=0;
            }
            else{
                val num = x.toInt();
                sum+=num;
                ans = max(sum,ans);

            }
        }
        return ans;
    }

    fun part2(input: List<String>): Int {
        var sum =0;
        var ans:Int=0;
        var sortedSet = mutableSetOf<Int>()
        for((i,x) in input.withIndex()){
            if(x==""){
                ans = max(sum,ans)
                sortedSet.add(sum)
                sum=0;
            }
            else{
                val num = x.toInt();
                sum+=num;
            }
        }
        if(input[input.lastIndex-1]==""){
            sum=0
            sum+=input.last().toInt()
            sortedSet.add(sum)
        }
        val sortedList = sortedSet.sorted()
        val lastElement= sortedList.last()
        val lastIndex= sortedList.lastIndexOf(lastElement)
        ans = lastElement+sortedList.elementAt(lastIndex-1)+sortedList.elementAt(lastIndex-2)
        return ans;
    }

    // test if implementation meets criteria from the description, like:

    val input = readInput("Day01")
//    println(part1(input))
    println(part2(input))
}
