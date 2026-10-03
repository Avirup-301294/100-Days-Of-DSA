# Given an integer array nums of size n, return the majority element of the array.

# The majority element of an array is an element that appears more than n/2 times in the array. 
# The array is guaranteed to have a majority element.

# Example 1:
# Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]
# Output: 7
# Explanation: The number 7 appears 5 times in the 9 sized array

# Example 2:
# Input: nums = [1, 1, 1, 2, 1, 2]
# Output: 1
# Explanation: The number 1 appears 4 times in the 6 sized array

from typing import List
class MajorityElement:
    # Moore's voting Algorithm
    def majorityElement(self, nums: List[int]) -> int:
        # Size of the given array
        n = len(nums)
        
        # Count
        cnt = 0
        
        # Element
        el = 0
        
        # Applying the algorithm
        for num in nums:
            if cnt == 0:
                cnt = 1
                el = num
            elif el == num:
                cnt += 1
            else:
                cnt -= 1
        
        """ Checking if the stored element
        is the majority element"""
        cnt1 = nums.count(el)
        
        # Return element if it is a majority element
        if cnt1 > (n // 2):
            return el
        
        # Return -1 if no such element found
        return -1


if __name__ == "__main__":
    majorityElement = MajorityElement()
    nums1 = [7, 0, 0, 1, 7, 7, 2, 7, 7]
    nums2 = [1, 1, 1, 2, 1, 2]
    
    ans1 = majorityElement.majorityElement(nums1)
    print("The majority element is:", ans1)

    ans2 = majorityElement.majorityElement(nums2)
    print("The majority element is:", ans2)