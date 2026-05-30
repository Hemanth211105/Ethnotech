import java.util.*;
class RotateArrayByK {
    
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of elements : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Value of K : ");
		int k=sc.nextInt();
		rotate(a,k);
		System.out.println("After rotated the elements are : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void rotate(int[] nums, int k) {
        int n=nums.length,j=0;
        k=k%nums.length;
        List<Integer> li=new ArrayList<>();
        for(int i=n-k;i<n;i++){
            li.add(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            li.add(nums[i]);
        }
        for(int i=0;i<li.size();i++){
            nums[j++]=li.get(i);
        }
    }
}
