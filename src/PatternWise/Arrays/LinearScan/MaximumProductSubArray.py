# Maximum Product Subarray in an Array

# Core
# Given an integer array nums. Find the subarray with the largest product, and return the product of the elements present in that subarray.

# A subarray is a contiguous non-empty sequence of elements within an array.

# Example 1:
# Input: nums = [4, 5, 3, 7, 1, 2]
# Output: 840
# Explanation: The largest product is given by the whole array itself

# Example 2:
# Input: nums = [-5, 0, -2]
# Output: 0
# Explanation:# The largest product is achieved with the following subarrays [0], [-5, 0], [0, -2], [-5, 0, -2].

class MaxProductSubarray:
    def maxProduct(self, nums):
        neg_cnt = 0
        for num in nums:
            if num < 0:
                neg_cnt += 1

        prod = 1
        if neg_cnt % 2 == 0:
            # complete array will be the product
            for num in nums:
                prod = prod * num

            return prod
        else:
            # find the prod till the first negative element from the front and from the back
            prod_till_front = 1
            prod_till_back = 1
            idx = 0
            for i, num in enumerate(nums):
                if num == 0:
                    idx = i
                    break
                prod_till_front = prod_till_front * num

            for i in range(idx+1, len(nums)):
                if nums[i] == 0:
                    break
                prod_till_back = prod_till_back * nums[i]

            return max(prod_till_front, prod_till_back)

            print(f"prod_till_front: {prod_till_front}, prod_till_front: {prod_till_back}")

if __name__ == "__main__":
    maxProductSubarray = MaxProductSubarray()

    nums1 = [4, 5, 3, 7, 1, 2]
    ans1 = maxProductSubarray.maxProduct(nums1)
    print(f"The max product subarray is {ans1}")

    nums2 = [-5, 0, -2]
    ans2 = maxProductSubarray.maxProduct(nums2)
    print(f"The max product subarray is {ans2}")