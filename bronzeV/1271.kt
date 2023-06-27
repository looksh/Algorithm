fun main() {
    // readLine()?.split(' ')?.map { it.toBigInteger() }를 사용하여 입력값을 공백으로 구분하여 BigInteger 타입으로 변환
    val (n, m) = readLine()?.split(' ')?.map { it.toBigInteger() } ?: return

    val amountPerLifeform = n / m
    val remainingMoney = n % m

    println(amountPerLifeform)
    println(remainingMoney)
}
