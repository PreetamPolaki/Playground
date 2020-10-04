def nop(a,b):
  if(a==0 or b==0):
    return 1
  else:
    return nop(a-1,b)+nop(a,b-1)
a=int(input())
b=int(input())
print(nop((a-1),(b-1)))

                              