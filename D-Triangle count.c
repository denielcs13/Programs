#include <stdio.h>

int main(void) {
	int t,l,k,i,j,s;
	scanf("%d",&t);
	for(i=1;i<=t;i++){
		scanf("%d%d",&l,&k);
		printf("Case %d: %d\n",i,k>l?0:(l-k+1)*(l-k+2)/2);
	}
	return 0;
}