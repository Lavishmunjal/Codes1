#include<stdio.h>
int gcd(int a,int b){
    if(b==0){
       return a;
    }
    else{
         return gcd(b,a%b);
    }

}
int ackerman(int m,int n){
    if(m==0){
        return n+1;
    }
    else if(m>0 && n==0){
        return ackerman(m-1,1);
    }
    else{
        return ackerman(m-1,ackerman(m,n-1));
    }
}
int main(){
    int a,b,m,n;
    printf("NAME = GAURAV PATEL\n");
    printf("ROLL NO. = 2100320120068\n");
    printf("enter two numbers for gcd:\n");
    scanf("%d%d",&a,&b);
    printf("GCD of %d and %d = %d \n",a,b,gcd(a,b));
    printf("enter the value of m and n :\n");
    scanf("%d%d",&m,&n);
    printf("A(%d,%d) = %d\n",m,n, ackerman(m,n));
}
