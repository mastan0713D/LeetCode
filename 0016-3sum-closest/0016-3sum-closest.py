class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        closest = nums[0] + nums[1] + nums[2]

        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1

            while left < right:
                current = nums[i] + nums[left] + nums[right]

                # update closest if this sum is nearer to target
                if abs(current - target) < abs(closest - target):
                    closest = current

                if current < target:
                    left += 1
                elif current > target:
                    right -= 1
                else:
                    return current   # exact match — best possible

        return closest
