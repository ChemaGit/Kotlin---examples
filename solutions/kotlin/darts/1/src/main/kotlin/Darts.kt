import java.lang.Math.*

object Darts {

    private val OUTSIDE: Int  = 0;
    private val OUTER_CIRCLE: Int  = 1;
    private val MIDDLE_CIRCLE: Int  = 5;
    private val INNNER_CIRCLE: Int  = 10;

    fun score(x: Number, y: Number /* choose proper types! */): Int {
        // TODO("Implement this function to complete the task")
        var puntuacion: Int = 0
        val distancia = Darts.point(x.toDouble(), y.toDouble())
        puntuacion = if(distancia > 10) { OUTSIDE
        } else if(distancia > 5) { OUTER_CIRCLE
        } else if (distancia > 1) { MIDDLE_CIRCLE
        } else { INNNER_CIRCLE
        } 
        return puntuacion
    }

    fun point(x: Double, y: Double): Double {
        var distancia: Double = sqrt(pow(x, 2.0) + pow(y, 2.0));
        return distancia
    }
}
