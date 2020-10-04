N=int(input())
s=input()
l=[]
for p in range(0,len(s)):
  l.append(True)
i=0
j=0
z=N
while(N!=1):
  if(l[i]==True):
    if(s[j]=='y'):
      l[i]=False
      N=N-1
      j=j+1
    else:
      j=j+1
  i=i+1  
  if(i>=z):
    i=0
  if(j>=len(s)):
    j=0
for k in range(len(l)):
  if(l[k]==True):
    print(k+1)
      
  