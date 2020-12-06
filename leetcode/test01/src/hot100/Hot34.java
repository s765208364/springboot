package hot100;

public class Hot34 {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==2&&nums[0]==target&&nums[1]==target)return new int[]{0,1};
        if(nums.length==1||nums.length==0)return new int[]{-1,-1};

        int l=0, r=nums.length-1,index=0;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                index = target;
                break;
            }
            if(nums[mid]<target){
                l=mid+1;

            }else{
                r=mid-1;
            }

        }
        int resultleft = index,resultright=index;
        while(nums[resultleft]!=target&&resultleft>0){
            resultleft--;
        }

        while(nums[resultright]!=target&&resultright<nums.length){
            resultright++;
        }
        return new int[]{resultleft,resultright};
    }


}
