# Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.

# Example 1:
# Input: nums = [1, 2, 1, 1, 3, 2]
# Output: [1]
# Explanation: Here, n / 3 = 6 / 3 = 2. Therefore the elements appearing 3 or more times is : [1]

# Example 2:
# Input: nums = [1, 2, 1, 1, 3, 2, 2]
# Output: [1, 2]
# Explanation: Here, n / 3 = 7 / 3 = 2. Therefore the elements appearing 3 or more times is : [1, 2]
from typing import List
class MajorityElementII:
    def majorityElementTwo(self, nums: List) -> int: 
        n = len(nums)
        cnt1 = 0
        cnt2 = 0
        el1 = 0
        el2 = 0
        for num in nums:
            if cnt1 == 0 and num != el2:
                cnt1 += 1
                el1 = num
            elif cnt2 == 0 and num != el1:
                cnt2 += 1
                el2 = num
            
            elif el1 == num: cnt1 += 1
            elif el2 == num: cnt2 += 1
            else: 
                cnt1 -= 1 
                cnt2 -= 1

        cnt1, cnt2 = 0, 0 
        
        for num in nums:
            if num == el1:
                cnt1 += 1 
            if num == el2:
                cnt2 += 1

        """ Determine the minimum count
        required for a majority element"""
        mini = n // 3 + 1
        
        # List of answers
        result = []

        """Add elements to the result list
        if they appear more than n/3 times"""
        if cnt1 >= mini:
            result.append(el1)
            
        if cnt2 >= mini and el1 != el2:
            # Avoid adding duplicate if el1 == el2
            result.append(el2)

        # Uncomment the following line if you want to sort the answer list
        # result.sort() # TC --> O(2*log2) ~ O(1);

        #return the majority elements
        return result


if __name__ == "__main__":
    majority_element_two = MajorityElementII()
    nums1 = [1, 2, 1, 1, 3, 2]
    ans1 = majority_element_two.majorityElementTwo(nums1)
    print("The majority elements are:", ans1)

    nums2 = [1, 2, 1, 1, 3, 2, 2]
    ans2 = majority_element_two.majorityElementTwo(nums2)
    print("The majority elements are:", ans2)