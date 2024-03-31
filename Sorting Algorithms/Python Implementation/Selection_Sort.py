class selectionsort:
    def __init__(self,x):
        self.x=x
    def selectionsort(self):
        x=self.x
        for i in range(len(x)):
            a=0
            b=(len(x)-1)-i
            for j in range(1,b):
                if(x[a]<=x[j]):
                    a=j
            temp=x[a]
            x[a]=x[b]
            x[b]=temp
        return x
x=[9,3,6,1,7,3,2]
result = selectionsort(x)
print(result.selectionsort())
