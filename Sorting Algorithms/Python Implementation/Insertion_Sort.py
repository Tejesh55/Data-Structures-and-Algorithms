class insertionsort:
    def __init__(self,x):
        self.x=x
    def insertionsort(self):
        x=self.x
        for i in range(1,len(x)):
            j=i-1
            key=x[i]
            while(x[j]>=key and j>=0):
                x[j+1]=x[j]
                j-=1
            x[j+1]=key
        return x
x=[9,3,6,11,7,3,12,10]
result = insertionsort(x)
print(result.insertionsort())
