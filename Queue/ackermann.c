#include<stdio.h>
int A(int m, int n);

main()
{
        int m,n;
        printf("Enter two numbers :: \n");
        scanf("%d%d",&m,&n);
        printf("\nOUTPUT %d\n",ack(m,n));
}

int ack(int m, int n)
{
        if(m==0)
            return n+1;
        else if(n==0)
            return ack(m-1,1);
        else
            return ack(m-1,ack(m,n-1));
}
