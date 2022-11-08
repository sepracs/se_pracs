// Binary search

// Sequential Cohesion in binary search

// The data elements that are given by the user becomes the input for the sorting process 

// The sorted list becomes the input to find out the middle term

// The output of the middle term become the input to determine whether the element to be searched is in the list or not

// The output of the search process becomes the input to decide whether to display "Element found" or "Element not found"


import java.util.*;

public class sequential_cohesion {
  public void binarySearch(int arr[], int first, int last, int key) {
    int mid = (first + last) / 2;
    while (first <= last) {
      if (arr[mid] < key) {
        first = mid + 1;
      }
      else if (arr[mid] == key) {
        System.out.println("Element found at position: " + (mid + 1));
        break;
      }
      else {
        last = mid - 1;
      }
      mid = (first + last) / 2;
    }
    if (first > last) {
      System.out.println("Element not found!");
    }
  }

  public static void main(String args[]) {
    int arr[] = new int[5];
    int key;
    Scanner scanner = new Scanner(System.in);

    // Enter array in sorted order
    for(int i = 0; i < arr.length; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
    System.out.print("Sorted Array: ");
    for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");


    System.out.print("\nEnter key: ");
    key = scanner.nextInt();

    scanner.close();
    int last = arr.length - 1;
    int first = 0;
    sequential_cohesion obj = new sequential_cohesion();
    obj.binarySearch(arr, first, last, key);
  }
}
