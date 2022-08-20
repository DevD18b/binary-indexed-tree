public class rangeUpdateQuery {

    // i am given a input tree in form of the array.
    // what i need to do is i need implement the getElement()
    // and the update() function for the binary indexed trees.

// update bring abount change in a value with in given certain index.
public static void update(int left, int val , int right , int [] arr){
arr[left] += val;
while(right+1<arr.length){
    arr[right]-=val;
}
}
// gives the sum with in the range.
public static int getElement(int index , int [] arr){
    int sum =0 ;
    for(int j =0; j<index; j++){
        sum +=   arr[j];
    }
    return sum;
}
// the time complexity of both these operation is o(n)

// lets think about how to make it upto log(n) using the fenwick tree.


public static int max = 1000;
public static int [] binaryIndexedTree = new int[max];

public static void updateTree(int index , int value , int n){
    index = index+1;
    while(index<n){
        binaryIndexedTree[index]+=value;
        index =  index + (index & -index);
    }
}
public static int getSum(int index){
    index++;
    int sum =0;
    while(index>0){
        sum+=binaryIndexedTree[index];
        index = index-(index& -index);
    }
    return sum;
}
public static void updateQuery(int left, int right ,int n , int val){
    updateTree(left, val, n);
    updateTree(right, -val, n);
}
public static void createTree(int [] input){
    int n = input.length;
    for(int i=0; i<n; i++)
    binaryIndexedTree[i] = 0;

    for(int i =0; i<n; i++){
        updateTree(i , input[i] ,n);
    }




}


















    

}
