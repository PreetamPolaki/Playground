def bday(n):
    return (n*((2*n)-1))
if __name__=='__main__':
  T=int(input())
  l=[]
  for i in range(T):
      l.append(int(input()))
  for j in range(T):
      print(bday(l[j])) 