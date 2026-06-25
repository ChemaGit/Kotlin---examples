object ETL {

    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val etl = mutableMapOf<Char, Int>()
        source.forEach{(punto, col) ->
            for(car in col) {
                etl.put(car.lowercaseChar(), punto)
            }
        }
        return etl
    }
}
