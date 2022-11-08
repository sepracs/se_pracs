#include<stdio.h>

int maxValue(int *arr) {
  int max = arr[0];
  for(int i = 0; i < 5; i++) 
  {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

int main()
{
  // Array is created
  int arr[] = {1, 2, 3, 4, 5};


  // This array is then passed to the maxValue function and the return value is stored in variable max
  int max = maxValue(arr);
  
  
  printf("The largest number: %d\n", max);
}