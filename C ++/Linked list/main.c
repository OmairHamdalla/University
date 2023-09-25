#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	float n1 ,n2;
	printf("add inputs: ");
	scanf("%f%f",&n1,&n2);
	
	int result = n1+n2;
	int difference = n1 - n2;
	float devision = n1 / n2;
	int mult = n1 * n2;
	
	printf("\nThe sum of %f and %f is %d",n1,n2,result);
	printf("\nThe dev of %f and %f is %f",n1,n2,devision);
	printf("\nThe mult of %f and %f is %d",n1,n2,mult);
	printf("\nThe dif of %f and %f is %d",n1,n2,difference);
	
	return 0;
}
