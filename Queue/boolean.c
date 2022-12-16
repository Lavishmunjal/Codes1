#include<stdio.h>
int main(){
    int i,c,a[4]={0,0,1,1};
    int b[4]={0,1,0,1};
    printf("NAME = GAURAV PATEL\n");
    printf("ROLL NO. = 2100320120068");
    printf("\nTRUTH TABLE OF AND GATE :");
    printf("\n========================================");
    printf("\nA\t\tB\t\tA and B");
    printf("\n========================================");
    for(i=0;i<4;i++){
        c=a[i]&b[i];
        printf("\n%d\t\t%d\t\t %d",a[i],b[i],c);
    }
    printf("\nTRUTH TABLE OF OR GATE : ");
    printf("\n========================================");
    printf("\nA\t\tB\t\tA OR B");
    printf("\n========================================");
    for(i=0;i<4;i++){
        c=a[i]|b[i];
        printf("\n%d\t\t%d\t\t %d",a[i],b[i],c);
    }
    printf("\nTRUTH TABLE OF NOT GATE :");
    printf("\n========================================");
    printf("\nA\t\t Not A");
    printf("\n========================================");
    for(i=0;i<2;i++){
        c=!b[i];
        printf("\n%d\t\t %d",b[i],c);
    }

}
