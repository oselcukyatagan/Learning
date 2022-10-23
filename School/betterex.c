
#include <stdio.h>


int main()
{

int numOfValues;

printf("How many values: ");
scanf("%d", &numOfValues);

int sum;
int product = 1;
int num;
int i;

for(i = 0; i < numOfValues; i++)
{   
    printf("Write a number: ");
    scanf("%d", &num);

    sum += num;
    product *= num;
}

    double avarage = (double) sum / numOfValues;
    
    printf("Sum = %d \n", sum);
    printf("Avarage = %lf \n",avarage);
    printf("Product = %d \n",product);
    
}
