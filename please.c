

#include <stdio.h>

int main()
{
    float horizontal;
    float vertical;
    int num3;

    printf("First variable: ");
    scanf("%f", &horizontal);
    printf("Second variable: ");
    scanf("%f", &vertical);

    num3 = 2 * (horizontal + vertical);
    int area = horizontal * vertical;

    printf("perimeter = %d\n", num3 );
    printf("area = %d", area);

}