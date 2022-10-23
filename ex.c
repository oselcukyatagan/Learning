
#include <stdio.h>


int main()
{

    double num1;
    double num2;
    double num3;

    printf("First number:");
    scanf("%lf", &num1);
    printf("Second number:");
    scanf("%lf", &num2);
    printf("Third number:");
    scanf("%lf", &num3);

    int sum = num1 + num2 + num3;
    double avarage = (num1 + num2 + num3)/3;
    int product = num1 * num2 * num3;


    printf("Total = %d \n", sum);
    printf("Avarage = %lf \n", avarage);
    printf("Product = %d \n", product);
    
}