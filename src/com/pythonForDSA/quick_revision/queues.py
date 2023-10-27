# Queues in python are double ended queue by default
from collections import deque

queue = deque()
queue.append(1)
queue.append(2)
print(queue)    # deque([1, 2])

queue.popleft()
print(queue)    # deque([2])

queue.appendleft(3) # deque([3, 2])
print(queue)

queue.pop()
print(queue)    # deque([3])

queue.append(5)
print(queue)    # deque([3, 5]

queue.insert(1, 7)
print(queue)    # deque([3, 7, 5])