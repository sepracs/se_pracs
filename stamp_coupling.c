#include <stdio.h>
#include <string.h>

typedef struct 
{
  char name[20];
  int age;
  int roll_no;
}student;

void printAge(student s)
{
  printf("The age of the student is %d\n", s.age);
}

void printRollNo(student s)
{
  printf("The roll no of the student is %d\n", s.roll_no);
}

void printName(student s)
{
  printf("The name of the student is %s\n", s.name);
}

void setAge(student *s)
{
  printf("Enter new age: ");
  scanf("%d", &s->age);
}

int main()
{
  student s;
  printf("Enter the name of the student: ");
  fgets(s.name, 20, stdin);
  printf("Enter the age of the student: ");
  scanf("%d", &s.age);
  printf("Enter the roll no of the student: ");
  scanf("%d", &s.roll_no);

  printName(s);
  printAge(s);
  printRollNo(s);
  setAge(&s);
  printAge(s);

}