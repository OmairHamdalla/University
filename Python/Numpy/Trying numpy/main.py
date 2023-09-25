import numpy as np
arr = np.array([1,2,3,4,5,4])
dar = np.array([[[1,2,3] , [4,5,6]] , [[7,8,9], [10,11,12]]])
new = dar.copy()
print(new.shape)
print(dar[1,0:2])
