public class magicTriplet {
    // a magic triplet is one 
    // which follows following property.
    //  arr[i]<arr[j] && arr[j]<arr[k]


public static int driverFunction(int [] arr , int n){

// brute force way to solve this problem...
// expected tc --> quardratic in nature.
int count  =0;
for(int i =0; i<n-2; i++){
    for(int j =i+1; j<n-1; j++){
        for(int  k= j+1; k<n; k++){
            if(arr[i]<arr[j] && arr[j]<arr[k] && i<j && j<k){
                count++;
            }
        }
    }
}
return count;



}



    
}
