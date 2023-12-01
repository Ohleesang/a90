/** 1~30 clothes :[의상의이름,의상의종류]
 *  1~20 모든 문자열 : 알파벳 소문자 or '_'으로 구성
 *
 *  서로 다른 옷의 조합의 경우의수를 구하여 int값으로 반환
 */







class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        var clothesMap = mutableMapOf<String,MutableList<String>>()

        //[옷의 타입,[옷이름1,옷이름2...]] 의 자료형태로 저장하고싶다
        clothes.forEach{// clothes : [옷의이름,옷의종류]
            if(clothesMap.contains(it[1])){
                clothesMap.get(it[1])?.add(it[0]) //리스트에 추가
            }
            else{
                var s = mutableListOf(it[0])
                clothesMap.put(it[1],s)
            }
        }

        //clothesMap 의 List에 저장된 값의 '조합의 합'을 구하면 된다..!
        var n = 0
        var r = 1
        clothesMap.forEach{
            n += it.value.count()
        }


        return answer
    }
}
fun main(){
    var a = Solution()
    a.solution(arrayOf(arrayOf("yellow_hat", "headgear"),arrayOf("blue_sunglasses", "eyewear"),arrayOf("green_turban", "headgear")))
    a.solution(arrayOf(arrayOf("crow_mask", "face"),arrayOf("blue_sunglasses", "face"),arrayOf("smoky_makeup", "face")))
}