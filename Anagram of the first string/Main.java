def split(word):
    return [char for char in word]

s1=input()
s2=input()
if(len(s1)==len(s2)):
    x=(split(s1))
    x.sort()
    y=(split(s2))
    y.sort()
    if(x==y):
        print('Anagram')
    else:
        print('Not anagrams')
else:
     print('Not anagrams')
    