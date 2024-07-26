/**  자바 메소드 파라미터는 디폴트가 가변이므로 함수 내부에서 변경하지 못하게 하려면 final을 지정해 불변 값으로 바꿔야 하는데,
코틀린 함수 파라미터는 무조건 불변이다. 즉, 함수 본문에서 파라미터 값을 변경하면 컴파일 오류가 발생한다.

 하지만 increment2의 참조가 배열이라면 호출한 쪽의 데이터는 그대로 남아있고 이 데이터에 대한 참조만 복사가 된다.
 */
fun increment(n: Int): Int{
//    return n++; Error
    return n;
}

fun increment2(a: IntArray): Int {
    return ++a[0]
}

fun main(){
    println( increment(5) )

    val a = intArrayOf(1, 2, 3)
    println(increment2(a))
    println(a.contentToString())
}