import numpy as np

def displayArray(array):
    print("\nThis array is:", array.ndim ,"D")
    print(array)

arr0D = np.array(1)
displayArray(arr0D)

arr1D = np.array([1,2,3,4,5,6])
displayArray(arr1D)


arr2D = np.array([[1,2,3],[4,5,6]])
displayArray(arr2D)
print("This array is made out of" , arr2D.shape[0] , "sets,\nEach set include" , arr2D.shape[1] , "variables." )


arr3D = np.array([   [ [1, 2, 3] , [4, 5, 6] ] , [ [7, 8, 9] , [10, 11, 12] ]   ])
displayArray(arr3D)
print("This array is made out of", arr3D.shape[0]  ,"slots, Each slot has " ,  arr3D.shape[1]  , "sets,\nEach set include" , arr3D.shape[2] , "variables.")


