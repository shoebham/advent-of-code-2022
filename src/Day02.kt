
fun main() {
    fun part1(input: List<String>): Int {
        var ans=0
//        A->Rock B->Paper C->Scissors
//        X->Rock Y->Paper Z->Scissors
        for(turn in input){
            val opp = turn[0]
            val us = turn[2]

            when(opp){
                'A'->{
                    if(us=='X'){
                        ans+=4
                    }else if(us=='Y'){
                        ans+=8
                    }else{
                        ans+=3
                    }
                }
                'B'->{
                    if(us=='X'){
                        ans+=1
                    }else if(us=='Y'){
                        ans+=5
                    }else{
                        ans+=9
                    }
                }
                'C'->{
                    if(us=='X'){
                        ans+=7
                    }else if(us=='Y'){
                        ans+=2
                    }else{
                        ans+=6
                    }
                }
            }
        }
        return ans
    }

    fun part2(input:List<String>):Int{
        var ans=0
//        A->Rock B->Paper C->Scissors
//        X->Lose Y->Draw Z->Win
//        1         2       3
//        lose = 0 draw = 3 win = 6
        for(turn in input){
            val opp = turn[0]
            val us = turn[2]

            when(opp){
                'A'->{
                    if(us=='X'){
                        ans+=3
                    }else if(us=='Y'){
                        ans+=4
                    }else{
                        ans+=8
                    }
                }
                'B'->{
                    if(us=='X'){
                        ans+=1
                    }else if(us=='Y'){
                        ans+=5
                    }else{
                        ans+=9
                    }
                }
                'C'->{
                    if(us=='X'){
                        ans+=2
                    }else if(us=='Y'){
                        ans+=6
                    }else{
                        ans+=7
                    }
                }
            }
        }
        return ans
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}