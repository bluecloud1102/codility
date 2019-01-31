is_merge=m=lambda s,x,y:not(s+x+y)or f(s,x,y)or f(s,y,x)
f=lambda s,x,y:s and x and s[0]==x[0]and m(s[1:],x[1:],y)