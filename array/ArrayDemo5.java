package array;

public class ArrayDemo5 {
    static void main(String[] args) {
        /*
        数组常见问题：索引越界
         */
        int[] arr = new int[]{10,20,30,40,50};
        int index = 10;
        if(index >= 0 && index < arr.length){
            System.out.println(arr[index]);
        }else{
            System.out.println("索引越界");
        }
    }
}
