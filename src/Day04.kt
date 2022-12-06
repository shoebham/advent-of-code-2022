

fun main(){

    fun part1(input:List<String>):Int{

        var start1=0
        var start2=0
        var end1=0
        var end2=0
        var ans=0
        for(inp in input){
            var temp=""
            var cnt=0
            for((i,num) in inp.withIndex()){
                if(num!='-'&&num!=',')temp+=num
                    if(num=='-'&&cnt==0){
                        start1=temp.toInt()
                        temp=""
                        cnt++
                    }else if(num==','&&cnt==1){
                        end1=temp.toInt()
                        temp=""
                        cnt++
                    }else if(num=='-'&&cnt==2){
                        start2=temp.toInt()
                        temp=""
                        cnt++;
                    }else if(i==inp.length-1){
                        end2=temp.toInt()
                        temp=""
                    }
            }
//            println("start1 "+start1)
//            println("end1 "+end1)
//            println("start2 "+start2)
//            println("end2 "+end2)
            if(start1<=start2&&end1>=end2)ans++;
            else if(start1>=start2&&end1<=end2)ans++;
        }
//        println(start1)
//        println(end1)
//        println(start2)
//        println(end2)

        return ans
    }
    fun part2(input:List<String>):Int{


        var start1=0
        var start2=0
        var end1=0
        var end2=0
        var ans=0
        for(inp in input){
            var temp=""
            var cnt=0
            for((i,num) in inp.withIndex()){
                if(num!='-'&&num!=',')temp+=num
                if(num=='-'&&cnt==0){
                    start1=temp.toInt()
                    temp=""
                    cnt++
                }else if(num==','&&cnt==1){
                    end1=temp.toInt()
                    temp=""
                    cnt++
                }else if(num=='-'&&cnt==2){
                    start2=temp.toInt()
                    temp=""
                    cnt++;
                }else if(i==inp.length-1){
                    end2=temp.toInt()
                    temp=""
                }
            }
//            println("start1 "+start1)
//            println("end1 "+end1)
//            println("start2 "+start2)
//            println("end2 "+end2)
                if(start1.coerceAtLeast(start2)<=end1.coerceAtMost(end2))ans++
        }
//        println(start1)
//        println(end1)
//        println(start2)
//        println(end2)

        return ans

    }

    var input = readInput("Day04")
    println(part2(input))
}