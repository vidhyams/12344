#include <stdio.h>
int gcd(int p, int q)
{
    if (p== 0 || q== 0)
       return 0;
    if (p== q)
        return q;
    if (p > q)
        return gcd(p-q, q);
    return gcd(p, q-p);
}
void main()
{
    int p= 98, q = 56;
    printf("GCD of %d and %d is %d ", a, b, gcd(a, b));
}
