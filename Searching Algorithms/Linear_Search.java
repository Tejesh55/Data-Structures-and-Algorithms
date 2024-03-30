public class test{
	public static int linearSearch(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int target = 9;
		int result = linearSearch(nums,target);
		if(result!=-1) {
			System.out.println("The target "+ target +" exists in the array at "+result+" position");
		}
		else
			System.out.println("The target value doesn't exist");
	}
}
