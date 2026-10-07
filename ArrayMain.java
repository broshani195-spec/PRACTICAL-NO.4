import java.util.Scanner;

class ArrayDemo{
    int arr[];
    int size;

    ArrayDemo(int n){
        size = n;
        arr = new int[size];
    }
    void acceptArray(){
        Scanner sc = new Scanner(Syst10em.in);
        System.out.println("Enter"+size+"elements:");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
    }
    void displayArray(){
        System.out.println("Array Elements");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[1]+" ");
        }
        System.out.println();
    }
    void insertElements(int pos, int value){
        if(pos<0 || pos> size){
            System.out.println("Invalid Posotion!");
            return;
        }
        int newArr[] =new int[size + 1];
        for(int i=0, j = 0; i< newArr.length; i++){
            if(i == pos){
                newArr[1] = value;
            }else{
                 newArr[1] = arr[j++];
            }
        }
        arr = newArr;
        size++;
    }
    void deleteElements(int pos){
        if(pos<0 || pos>=size){
            System.out.println("invalid position!");
            return;
        }
        int newArr[] = new int[size - 1];
        for (int i =0, j= 0; i< size; i++){
            if(i != pos){
                newArr[j++] = arr[i];
            }
        }
        arr = newArr;
        size--;
    }
    void linearsearch(int key){
        boolean found = false;
        for(int i =0; i<size; i++){
            if(arr[i]== key){
                System.out.println("Elements"+ key +"found at position"+i);
                found = true;
                break;
            }
        }
        
    }
    void bubbleSort(){
        for(int i = 0; i<size-1; i++){
          for(int j =0; j <size-i-1; j++)  {
            if (arr[j]> arr[j+1]){
                
                int temp = arr[j];
                arr[j]= arr[j +1];
                arr[j +1]= temp;
            }

          }
        }
        System.out.println("Array after Bubble Sort:");
        displayArray();
    }
}
public class ArrayMain {

    public static void main(String[] args){
        ArrayDemo obj = new ArrayDemo(5);
        obj.acceptArray();

        obj.displayArray();

        obj.insertElements(2, 99);
        System.out.println("After Insertion:");
        obj.displayArray();

        obj.deleteElements(3 );
        System.out.println("After Deletion:");
        obj.displayArray();

        obj.linearsearch(50);
        obj.bubbleSort();

    }
}