package de.romankoutny.kotlin

fun main(args: Array<String>) {
    val REF = 2
    val balances = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val mainAccount = balances.filter{it==REF}
    if(mainAccount.isNotEmpty())
    {
        mainAccount[0]?.let {
            val sortedBalances = mutableListOf<Int>(it)
            balances.filter{it!=REF}.forEach { sortedBalances.add(it) }

            sortedBalances.forEach{println("Wert $it")}
        }
    }

}
