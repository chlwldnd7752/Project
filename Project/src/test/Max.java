package test;

public class Max {

	public static void main(String[] args) {
		int[] nums={57, 5, 10, 7, 63, 9};
		min(nums);	 
	}
	
	private static void min(int[] nums){
 
			int min=nums[0];
			
			for(int i=1; i<nums.length; i++){
					if(min>nums[i]){
						min=nums[i];
					}
		      }//for
			
			System.out.println(min);
	}//sort
 
}
