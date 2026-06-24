object EliudsEggs {
    fun eggCount(number: Int): Int {
        var auxNumber = number
        var count = 0

        while (auxNumber > 0) {
            // 'and 1' verifica si el último bit es 1 (equivalente a % 2 == 1)
            count += auxNumber and 1
            // 'shr 1' desplaza los bits a la derecha (equivalente a / 2)
            auxNumber = auxNumber shr 1
        }

        return count
    }
}
