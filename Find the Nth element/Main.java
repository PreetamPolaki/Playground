n=int(input())
stringw=(input())
q=int(input())
x=stringw.split()
if(q>len(x)):
  print('No node found')
else:
  y=x[q-1]
  print(y)
    



