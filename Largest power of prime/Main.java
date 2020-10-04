def p(a,b):
  y=0
  while(a!=0):
    a=a//b
    y=y+a
  return (y)  
  
if __name__=="__main__":
  T=int(input())
  l=[]
  for j in range(T):
    l.append([int(x) for x in input().split(' ')])
  for t in range(len(l)):
     print(p(l[t][0],l[t][1]))   
 
    
