public class Chapter10_Changing_objects {

    static void change(int A[], int index,int value){
        A[index] = value;
    } 
    public static void main(String[] args) {
        int My_Array[] = {3,4,2,5,7,4,90};
        change(My_Array, 1, 100);

        for(int i:My_Array){
            System.out.print(i+" ");
        }
    }
}
