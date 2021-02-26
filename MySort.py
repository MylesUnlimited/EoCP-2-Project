"""
@author: Myles D
"""

import random #Implemented random for randomized lists.

def randomList():
    
    listA = []
    
    for i in range(100): #Action code c: 100 elements in the randomized list.
        n = random.randint(1,1000)
        listA.append(n)
        
    
    return listA

def MySort(nums):
    n = len(nums)
    
    swapped = True
    
    while swapped:
        swapped = False
        
        for i in range(0, n-2):
            if nums[i] > nums[i+1]:
                temp = nums[i+1]
                nums[i+1] = nums[i]
                nums[i] = temp
                swapped = True
                
def test():
    for i in range(30): #Action code d: 30 randomized tests ran.
        listA = randomList()
        MySort(listA)
        print(listA)

import time

begin = time.time()
test()
print("4 = %d, computed in = %f" % (lambda: time.time()-begin))
