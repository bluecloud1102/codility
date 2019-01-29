package gap
import kotlin.math.sqrt

fun gap(g:Int, m:Long, n:Long):LongArray {
    var b_prime:Long = 0
    for(i in m..n){
        if(isPrime(i)){
            if((i - b_prime).compareTo(g) == 0){
                return longArrayOf(b_prime,i)
            }
            b_prime = i
        }
    }
    return longArrayOf()
}

fun isPrime(n:Long):Boolean{
    for(i in 2..sqrt(n.toDouble()).toLong()){
        if((n % i).compareTo(0) == 0){
            return false
        }
    }
    return true
}
