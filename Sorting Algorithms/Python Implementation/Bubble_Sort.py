class bubblesort:
    def __init__(self,x):
        self.x=x
    def bubblesort(self):
        x=self.x
        for i in range(len(x)):
            for j in range((len(x) - 1) - i):
                a = 0
                if (x[j] >= x[j + 1]):
                    a = x[j]
                    x[j] = x[j + 1]
                    x[j + 1] = a
        return x

x=[9,3,6,1,7,3,2]
result = bubblesort(x)
print(result.bubblesort())
