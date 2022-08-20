public class inversionCount {
    // arr[i] > arr[j] for i<j
    // for example 3 2 1
    // inversion count will be 
    // (3,1)(3,1)(2,1) --> 3.
    // i am going to solve this in both the ways.
    // well the fencwick approach to
    // solve this problem is  a bit tough.
    // and solve this problem in nlog(n)
  // so is true for the merge sort approach when it comes
  // to time complexity.


// brute force approach.
public static int brute(int [] arr , int n){
// time complexity of this  approach is almost 
// quardratic.
int count  =0;
for(int i =0; i<n-1; i++){
    for(int j =i+1; j<n; j++){
      if(arr[i]>arr[j] && i>j){
        count++;
      }
    }
    
}
return count;

}

public static int inversionCountEffectiveOne(int [] arr , int n){
int [] temp = new int [n];
int ans  = mergeSort(arr, temp, 0, arr.length-1);

return ans;

}
public static int mergeSort(int [] arr , int [] temp , int left, int right){

int inversionCount  =0;
int mid  = 0;
if(right>left){
mid = (left)+(right-left)/2;

inversionCount = mergeSort(arr , temp, left, mid);
inversionCount+= mergeSort(arr, temp, mid+1, right);

inversionCount+=merge(arr , temp , left ,mid , right);

}
return inversionCount;
}

public static int  merge(int [] arr , int [] temp , int left, int mid , int right){


int i =left;
int j = mid;
int k = left;
int inversionCount  =0;

while((i<=mid-1) && (j<=right)){
    if(arr[i]<arr[j]){
        temp[k++]=arr[i++];
    }
    else{
        temp[k++] = arr[j++];
        inversionCount+=(mid-i);
    }
}
while(i<=mid-1){
    temp[k++] = arr[i++];
}
while(j<=right)
{
    temp[k++] = arr[j++];
}
for(i= left; i<=right; i++){
    temp[i] = arr[i];
}
return inversionCount;

}








}
