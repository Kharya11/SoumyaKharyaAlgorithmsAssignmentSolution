package com.dsAssignement2.model;

//Merge sort to sort stocks in ascending and descending order

public class Sorting2 {
	
	void mergeAsc(double nums[], int left, int m, int right) {
	    int n1 = m - left + 1;
	    int n2 = right - m;
	    
	    double Left_part_arra[] = new double[n1];
	    double Right_part_arra[] = new double[n2];
	    
	    for (int i = 0; i < n1; ++i)
	        Left_part_arra[i] = nums[left + i];
	    for (int j = 0; j < n2; ++j)
	        Right_part_arra[j] = nums[m + 1 + j];

	    int i = 0, j = 0;

	    int k = left;
	    while (i < n1 && j < n2) {
	        if (Left_part_arra[i] <= Right_part_arra[j]) {
	            nums[k] = Left_part_arra[i];
	            i++;
	        } else {
	            nums[k] = Right_part_arra[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        nums[k] = Left_part_arra[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        nums[k] = Right_part_arra[j];
	        j++;
	        k++;
	    }
	}

	
	public void Sort(double[] nums, int left, int right,int type) {
		// TODO Auto-generated method stub
		if (left < right) {
	        int m = (left + right) / 2;
	        Sort(nums, left, m,type);
	        Sort(nums, m + 1, right,type);
	        if(type==1) {
	        	mergeAsc(nums, left, m, right);
	        }else if(type==2) {
	        	mergeDesc(nums, left, m, right);
	        }
	    }
		
	}
	
	public static void mergeDesc(double[] arr, int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;
		
		double leftArr[] = new double[len1];
		double rightArr[] = new double[len2];
		
		for(int i=0;i<len1; i++) 
			leftArr[i]=arr[left+i];
		for(int j=0; j<len2;j++)
			rightArr[j]=arr[mid+1+j];
		
		int i,j,k;
		i=0;
		j=0;
		k=left;
		
		while(i < len1 && j< len2) {
			if(leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
}
