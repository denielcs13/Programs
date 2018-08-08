t=int(input());
while(t>0):
	t=t-1;
	n,a,b = [int(x) for x in input().split(" ")];
	s=round((n*b)/(a+b));
	y=n-s;
	sum=a*s*s+b*y*y;
	print(sum);