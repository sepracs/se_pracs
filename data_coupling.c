// Data coupling
// Data coupling occurs when modules share data through, for example, parameters. Each datum is an elementary piece, and these are the only data shared (e.g., passing an integer to a function that computes a square).


#include <stdio.h>

float square(float input)
{
  return input * input;
}

int main() 
{
  float input, result;
  printf("Enter a number: ");
  scanf("%f", &input);

  printf("The square of %f is %f\n", input, square(input));
}

