import math

def gap(g, m, n):
    b_prime = 0
    for i in range(m,n):
        if isPrime(i):
            if(i - b_prime) == g:
                return [b_prime, i]
            b_prime = i
    return None

def isPrime(n):
    for i in range(2,int(math.sqrt(n)+1)):
        if n % i == 0:
            return False
    return True