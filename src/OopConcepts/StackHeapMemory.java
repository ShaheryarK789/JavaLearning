
 /*    In this lecture we are discussing:
1) Memory management in java and typed of categories to store data in memory.
2)What is stack ?
3)What is heap ?
4) where instance variable and local variable is allocated?

#1
In java we are managing our memory using two data structure stack and heap.
two categories to store data in memory:
1) Stack data structure
2) heap data structure

#2
Stack is data structure which follow LIFO(Last in First Out) principle.

#3
heap is data structure which is used to store data in form of object and object is a collection of data and method.

#4
class Student{
    int instVariable; //store in object and object created in heap
    public static void main(String []args){
        int localVariable=0;      //local variable store in stack frame of method in stack area.
        Student st=new Student(); //st is reference variable store address of new Student() object
    }

    public int add(int num1,int num2){
        return num1+num2;
    }
}


🧹 Garbage Collection in Java = JVM’s automatic memory management system
It reclaims memory from objects no longer referenced, keeping the program efficient and safe from memory leaks.


-- instance variable stored in object and object are in heap therefore we can say that instance variable created in heap.
-- method declaration and definition is present in object but actual implementation present in stack frame of stack.
-- local variable created in stack during call of method.
-- stack frame of called method is present in stack area.
-- st is reference variable created inside the current stack frame and it is reference variable store address of student object created in heap area.
-- new Student() create object in heap area and pointed by his reference variable.

}
 */
