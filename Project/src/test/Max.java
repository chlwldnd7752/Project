package test;

public class Max {

	public static void main(String[] args) {
		int[] nums={57, 5, 10, 7, 63, 9};
		max(nums);	//최대값 구하기
	}
	
	private static void max(int[] nums){

			int max=nums[0];
			
			for(int i=1; i<nums.length; i++){
					if(max<nums[i]){
						max=nums[i];
					}
		      }//for
			
			System.out.println(max);
	}//sort

}
