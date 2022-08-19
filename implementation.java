
public class implementation{
    // today we are going to implement some very basics
    // operation on binary indexed tree
    // it is efficiently used to find the range sum
    // within perticular limit.

    static int MAX = 1000;
    static int [] bitTree = new int[MAX];


 static    int getSum(int index){
        int sum=0;
        index = index+1;
        while(index>0){
            sum+=bitTree[index];
            

            index = index - (index& -index);
        }
        return sum;
    }
    public static void getUpdateBit(int n ,int index, int val){
        index = index+1;
        while(index<=n){
            bitTree[index]+=val;
            index +=(index &-index);
        }
    }

    public static void constructBinaryTree(int [] arr , int n){

        for(int i =1; i<=n; i++){
            bitTree[i] = 0;
                }


                for(int i=0; i<n; i++){
                    getUpdateBit(n, i, arr[i]);
                }


    }


public static void main(String [] args){
    
    int freq[] = {2, 1, 1, 3, 2, 3, 
        4, 5, 6, 7, 8, 9};
int n = freq.length;

constructBinaryTree(freq, n);
System.out.println("Sum of element in arr [0..5] is : "+getSum(5));

freq[3]+=6;
getUpdateBit(n, 3, 6);

System.out.println("Sum after updatation is : "+getSum(5));




    }

}